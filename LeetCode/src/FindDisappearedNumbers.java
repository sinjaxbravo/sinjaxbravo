import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        if (nums.length < 1) {
            return list;
        }

        Arrays.sort(nums);
        boolean[] numbers = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            numbers[nums[i]] = true;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (!numbers[i]) {
                list.add(i);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
