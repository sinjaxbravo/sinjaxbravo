
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int longest = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            int temp = 1;
            int next = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (next < nums[j]) {
                    temp++;
                    next = nums[j];
                }
            }
            if (temp > longest) {
                longest = temp;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] i = { 10, 9, 2, 5, 3, 7, 101, 18 };
        System.out.println(lengthOfLIS(i));
    }

}
