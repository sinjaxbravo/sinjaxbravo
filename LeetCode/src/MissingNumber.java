import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int temp = 0;
        int missing = 0;
        boolean missed = false;
        if (nums.length > 0) {
            temp = nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != temp + i) {
                missing = temp + i;
                missed = true;
            }
        }

        if (nums.length > 0 && !missed) {
            missing = nums[nums.length - 1]++;
        }

        return missing;

    }

    public static void main(String[] args) {
        int[] temp = { 3, 0, 1 };
        System.out.println(missingNumber(temp));

    }

}
