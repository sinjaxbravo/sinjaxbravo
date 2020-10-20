import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ThreeSumLeetCodes {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        List<List<Integer>> finalList = new LinkedList<>();
        list = generateArrays(nums, 0, nums.length, list);

        Set<Set<Integer>> tempSet = new HashSet<>();
        Set<Integer> tempS = new HashSet<>();
        boolean contains = false;

        for (int i = 0; i < list.size(); i++) {
            List<Integer> sums = list.get(i);

            int sum = sums.get(0);

            for (int k = 1; k < sums.size(); k++) {
                sum += sums.get(k);
                if (sum == 0) {

                    while (k < sums.size() - 1) {
                        sums.remove(sums.size() - 1);

                    }
                    for (int j : sums) {
                        tempS.add(j);
                    }

                    contains = true;
                    if (!tempSet.contains(tempS)) {

                        tempSet.add(tempS);

                    }

                }

            } //end of inner for
        }

        System.out.println(tempSet);

        Object[] tempArray = tempSet.toArray();
        for (int i = 0; i < tempArray.length; i++) {
            System.out.println(tempArray[i].toString());
            //finalList.add((List<Integer>) tempArray[i].toString());
        }

        return finalList;
    }//end of method

    public static List<List<Integer>> generateArrays(int[] s, int start,
            int stop, List<List<Integer>> list) {
        if (start == stop) {
            List<Integer> l1 = new LinkedList<>();
            for (int i : s) {
                l1.add(i);
            }
            list.add(l1);

        } else {
            for (int i = start; i < s.length; i++) {
                int[] swapped = swap(s, start, i);
                generateArrays(swapped, start + 1, stop, list);

            }

        }
        return list;
    }

    public static int[] swap(int[] i, int start, int stop) {
        int temp;
        temp = i[start];
        i[start] = i[stop];
        i[stop] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] temp = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(temp));

    }

}
