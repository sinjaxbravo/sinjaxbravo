import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int temp = nums[i];
                int low = nums[j];
                int k = nums.length - 1;
                while (k > j) {
                    int high = nums[k];
                    if (temp + low + high == 0) {

                        l.add(new ArrayList<>());
                        l.get(l.size() - 1).add(temp);
                        l.get(l.size() - 1).add(low);
                        l.get(l.size() - 1).add(high);

                    }
                    k--;
                }
            }

        }
        List<List<Integer>> temp = new ArrayList<>();
        for (List<Integer> list : l) {
            Collections.sort(list);
            if (!temp.contains(list)) {
                temp.add(0, list);
            }
        }

        return temp;

    }

    public static void main(String[] args) {
        int[] temp = { 3, -2, 1, 0 };
        System.out.println(threeSum(temp));
    }

}
