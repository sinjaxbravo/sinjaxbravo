import java.util.Arrays;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        boolean hold = false;
        int holdInt = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int debug = nums[i];

            if (nums[i] != nums[i + 1] && hold == false) {
                return nums[i];
            } else if (holdInt == i && i != 0) {
                hold = false;
            } else {
                hold = true;
                holdInt = i + 1;
            }
        }

        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] temp = { 1 };
        System.out.println(singleNumber(temp));

    }

}
