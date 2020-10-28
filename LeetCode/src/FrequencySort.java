import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class FrequencySort {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), 1);

            } else {
                m.replace(s.charAt(i), m.get(s.charAt(i)) + 1);

            }
        }

        m.forEach((E, V) -> list.add(V));

        Collections.sort(list, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (list.size() > 0) {
            if (m.containsKey(s.charAt(j))
                    && m.get(s.charAt(j)) == list.get(0)) {
                int k = list.get(0);
                while (k > 0) {
                    sb.append(s.charAt(j));
                    k--;
                }
                list.remove(0);
                m.remove(s.charAt(j));
                j = 0;
            } else {
                j++;
            }
        }

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        frequencySort("tree");

    }

}
