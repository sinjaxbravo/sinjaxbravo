import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        LinkedList<LinkedList<Integer>> list = new LinkedList<>();
        int j = intervals.length - 1;
        Arrays.sort(intervals);
        int i = 0;
        if (j == 1) {
            return intervals;
        }

        while (i < j) {
            int temp1 = intervals[i][1];
            int temp2 = intervals[i + 1][0];
            if (temp1 > temp2) {
                list.add(new LinkedList<>());
                list.get(list.size() - 1).add(intervals[i][0]);
                list.get(list.size() - 1).add(intervals[i + 1][1]);
                i += 2;
            } else {
                list.add(new LinkedList<>());
                list.get(list.size() - 1).add(intervals[i][0]);
                list.get(list.size() - 1).add(intervals[i][1]);
                i++;
                if (i == j) {
                    list.add(new LinkedList<>());
                    list.get(list.size() - 1).add(intervals[i][0]);
                    list.get(list.size() - 1).add(intervals[i][1]);
                }
            }
        }
        int[][] array = new int[list.size()][2];
        for (int k = 0; k < list.size(); k++) {
            array[k][0] = list.get(k).get(0);
            array[k][1] = list.get(k).get(1);
        }
        return array;

    }

    public static void main(String[] args) {
        int[][] array = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] array1 = { { 1, 3 } };
        int[][] newArr = merge(array1);

        System.out.println(newArr.length);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i][0]);
            System.out.println(newArr[i][1]);
        }
    }

}
