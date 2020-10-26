import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        int[] x = intervals[0];
        list.add(x);
        int len = 0;
        for (int i = 1; i < intervals.length; i++) {
            int start = list.get(len)[0];
            int stop = list.get(len)[1];
            int nextStart = intervals[i][0];
            int nextStop = intervals[i][1];
            if (stop >= nextStart) {
                list.get(len)[1] = Math.max(stop, nextStop);
            } else {
                len++;
                list.add(new int[] { nextStart, nextStop });
            }

        }

        return list.toArray(new int[len][]);
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 3 }, { 2, 6 }, { 8, 10 } };

        int[][] returArr = merge(array);

        for (int[] i : returArr) {
            System.out.println(i[0]);
            System.out.println(i[1]);
            System.out.println("\n");
        }

    }

}
