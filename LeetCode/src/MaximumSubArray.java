
public class MaximumSubArray {

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = nums.length - 1; j >= i; j--) {
                temp = 0;
                for (int k = j; k >= i; k--) {
                    temp += nums[k];
                }
                if (temp > max) {
                    max = temp;
                }

            }

        }

        return max;

    }

    public static void main(String[] args) {
        int[] temp = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(temp));

    }

}
