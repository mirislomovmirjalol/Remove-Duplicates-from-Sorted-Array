import java.util.ArrayList;

public class StudentMenu {
    private ArrayList<Student> students;

    private KeyboardReader kbr;

    public StudentMenu() {
        students = new ArrayList<Student>();
        kbr = new KeyboardReader();
    }

    public void RunMenu() {
        String display = "1. Add a new student" + "\n2. Remove a student" + "\n3. Display all student details" + " \n4. exit";

        boolean exit = false;

        while (!exit) {
            // clear the console - note won`t work in IDE console.
            // see https://www.javatpoint.com/how-to-clear-screen-in-java for OS independent methods
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println(display);

            int choice = kbr.getInt("Select a menu option", 1, 4);
            switch (choice) {
                case 1:
                    Student student = enterStudentDetails();
                    students.add(student);
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }

    private Student enterStudentDetails() {
        String name = kbr.getString("Enter student name");
        int score = kbr.getInt("Enter student score", 0, 100);
        Student student = new Student(name, score);
        return student;
    }

    private void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("There are no students to display!!");
        } else {
            System.out.println("Student Details\n");
            for (int i = 0; i < students.size(); i++) {
                System.out.println("Student " + (i + 1) + " : " + "Name:" + students.get(i).getName() + " | Score:" + students.get(i).getScore() + " | Grade:" + students.get(i).getGrade());
            }
        }
        kbr.getString("Press enter to continue");
    }

    private void deleteStudent() {
        // Just to be safe ensure there are students to delete!
        if (students.isEmpty()) {
            System.out.println("There are no students to delete!!");
            kbr.getString("Press enter to continue");
            return;
        }

        // Display all students and allow user to select car to delete
        displayStudents();
        int index = 1;
        int remove = kbr.getInt("Select student to delete", 1, index);
        students.remove(remove - 1);
    }
}