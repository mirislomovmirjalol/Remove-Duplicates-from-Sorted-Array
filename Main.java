public class Main {
    public static void removeDublicates(int[] nums) {
        int i = 0;
        int j = 0;
        int[] expectedNums = {};
        while (i <= nums.length) {
            if (nums[i] != nums[i + 1]) {
                expectedNums[j] = nums[i];
                i++;
                j++;
            } else {
                System.out.println("test: " + "works");
                i++;
            }
        }
        for (int g = 0; g < expectedNums.length; g++) {
            System.out.println(expectedNums[g]);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 4, 4, 8, 9 };
        removeDublicates(nums);
    }
}