
public class IndexOfSumsLeetCode {

    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            index = traverse(nums, target, i, i + 1);
            if (index[0] != -1) {
                return index;
            }

        }

        return index;

    }

    public static int[] traverse(int[] nums, int target, int start, int stop) {
        if (nums[start] + nums[stop] == target) {
            int[] temp = { start, stop };
            return temp;
        } else {
            if (stop < nums.length - 1) {
                return traverse(nums, target, start, stop + 1);
            }

        }
        int[] temp = { -1, -1 };
        return temp;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 26;

        int[] temp = twoSum(nums, target);

    }

}
