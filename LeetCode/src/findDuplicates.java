import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class findDuplicates {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                dup.add(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        return dup;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
