import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int k;
            if (i < intervals.length - 1) {
                k = i + 1;
            } else {
                k = i;
            }
            int j = intervals[i][1];
            while (k <= intervals.length - 1 && j >= intervals[k][0]) {
                if (intervals[i][1] > intervals[k][1]) {
                    intervals[k][1] = intervals[i][1];
                }
                k++;
            }
            list.add(new ArrayList<>());
            list.get(list.size() - 1).add(intervals[i][0]);
            if (k - 1 == i) {
                list.get(list.size() - 1).add(intervals[i][1]);
            } else if (i != k) {
                list.get(list.size() - 1).add(intervals[k - 1][1]);
                i = (k - 1);

            } else {
                list.get(list.size() - 1).add(intervals[k][1]);
            }

        }
        System.out.println(list);
        int[][] temp = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            temp[i][0] = list.get(i).get(0);
            temp[i][1] = list.get(i).get(1);
        }

        return temp;

    }

    public static void main(String[] args) {
        int[][] array = { { 1, 4 }, { 3, 5 }, { 0, 2 } };

        merge(array);

    }

}
