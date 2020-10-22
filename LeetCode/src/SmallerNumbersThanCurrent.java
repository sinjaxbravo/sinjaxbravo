import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] t = new int[nums.length];
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            while (nums[i] != copy[j]) {
                j++;
            }
            t[i] = j;

        }

        return t;

    }

    public static void main(String[] args) {
        int[] i = { 8, 1, 2, 2, 3 };
        smallerNumbersThanCurrent(i);

    }

}
