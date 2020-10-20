
public class LongestCommonPrefixLeetCode {
    public static String longestCommonPrefix(String[] strs) {
        String temp[] = sort(strs);

        int i = iter(temp, 0);

        return temp.length > 0 ? temp[0].substring(0, i + 1) : "";
    }

    public static String[] sort(String[] strs) {
        int n = strs.length;
        String temp = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (strs[j - 1].length() > strs[j].length()) {
                    //swap elements
                    temp = strs[j - 1];
                    strs[j - 1] = strs[j];
                    strs[j] = temp;
                }

            }
        }

        return strs;

    }

    public static int iter(String[] strs, int count) {
        char temp = ' ';
        if (strs.length > 0 && strs[0].length() > count) {
            temp = strs[0].charAt(count);

            for (int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(count) != temp) {
                    return count - 1;
                } else if (i == strs.length - 1
                        && strs[i].charAt(count) == temp) {
                    return iter(strs, count + 1);

                }
            }
        }
        return count - 1;
    }

    public static void main(String[] args) {
        String[] s1 = { "flower", "flow", "flight" };
        String[] s2 = { "aa", "a" };
        String[] temp = sort(s1);

        System.out.println(longestCommonPrefix(s2));

    }
}
