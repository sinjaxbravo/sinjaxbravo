import java.util.Arrays;

public class NumIdenticalPairs {
    public static int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] temp = { 1, 1, 1, 1 };
        System.out.println(numIdenticalPairs(temp));
    }

}
