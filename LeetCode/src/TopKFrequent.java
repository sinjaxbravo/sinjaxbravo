import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> keys = new ArrayList<>();
        Map<Integer, Integer> mS = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mS.containsKey(nums[i])) {
                mS.put(nums[i], 1);
                keys.add(nums[i]);
            } else {
                int p = mS.get(nums[i]);
                mS.replace(nums[i], p, p + 1);

            }
        }
        int[] x = new int[k];
        List<Integer> list = new ArrayList<>(mS.values());
        list.sort(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            int j = 0;
            boolean b = false;
            while (j < keys.size() && !b) {
                if (mS.get(keys.get(j)) == list.get(0)) {
                    mS.remove(keys.get(j));
                    x[i] = keys.remove(j);
                    list.remove(0);
                    b = true;
                }
                j--;
            }
        }

        return x;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
