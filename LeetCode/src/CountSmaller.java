import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSmaller {
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            while (nums[i] != copy[j]) {
                j++;
            }
            l.add(l.size(), nums.length - (j + 1));

        }

        return l;
    }

    public static void main(String[] args) {
        int[] i = { 5, 2, 6, 1 };
        System.out.println(countSmaller(i));

    }

}
