
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] j = { 0, 4, 5, 1, 0, 6 };
        moveZeroes(j);

    }

}
