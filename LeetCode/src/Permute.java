import java.util.LinkedList;
import java.util.List;

public class Permute {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();

        callIt(nums, list, 0, nums.length);
        return list;

    }

    public static void callIt(int[] nums, List<List<Integer>> list, int start,
            int stop) {
        if (start == stop) {
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }
            list.add(temp);

        } else {
            int[] newA = nums.clone();
            for (int i = start; i < stop; i++) {
                int[] swapped = swap(newA, start, i);

                callIt(swapped, list, start + 1, stop);
            }
        }
    }

    public static int[] swap(int[] nums, int start, int stop) {
        int temp;
        temp = nums[start];
        nums[start] = nums[stop];
        nums[stop] = temp;

        return nums;
    }

    public static void main(String[] args) {
        int[] temp = { 1, 2, 3 };

        System.out.println(permute(temp));
    }

}
