public class Student {
    private String name;
    private int score;
    private String grade;


    public Student(String pName, int pScore) {
        setName(pName);
        setScore(pScore);
        setGrade();
    }

    // set name
    public void setName(String pName) {
        name = pName;
    } 
    // get name
    public String getName() {
        return name;
    }
    // set score
    public void setScore(int pScore) {
        score = pScore;
    }
    // get score
    public int getScore() {
        return score;
    }
    public void setGrade() {
        if (score >= 80 && score <= 100) {
            grade = "A+";
        } else if (score >= 70 && score <= 80) {
            grade = "A";
        } else if (score >= 60 && score <= 70) {
            grade = "B";
        } else if (score >= 50 && score <= 60) {
            grade = "C";
        } else if (score >= 40 && score <= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
    }
    public String getGrade() {
        return grade;
    }
}
