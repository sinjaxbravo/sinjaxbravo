
public class LongestPalindromicSubstringLeetCode {

    public static String longestPalindrome(String s) {
        int[] longest = { 0, 0 };
        int[] temp = { 0, s.length() - 1 };
        int origLen = s.length();
        int[] blank = { 0, 0 };
        for (int i = s.length() - 1; i >= 0; i--) {
            int[] temp2 = findIt(s.substring(0, i + 1), 0, blank, origLen, 0);
            if (palindrome(s.substring(0, i + 1), 0,
                    s.substring(0, i + 1).length() - 1)) {
                return s.substring(0, i + 1);
            }
            if (temp2[0] != 0) {
                temp[0] = temp[0] + temp2[0];
                return s.substring(temp[0], i + 1);
            }
        }

        return String.valueOf(s.charAt(0));
    }

    public static int[] findIt(String s, int longest, int[] index, int origLen,
            int iterations) {
        Boolean temp = palindrome(s, 0, s.length() - 1);
        if (temp) {
            index[0] = iterations;
            return index;
        }

        if (s.length() <= 1) {
            return index;
        } else {
            if ((index[1] - index[0]) > longest
                    && (index[1] - index[0] + 1) < origLen) {
                longest = index[1] - index[0];
            }
            return findIt(s.substring(1), longest, index, origLen,
                    iterations + 1);
        }

    }

    public static boolean palindrome(String s, int f, int b) {
        if (f >= b && s.length() > 1) {
            return true;
        } else {
            if (s.charAt(f) != s.charAt(b)) {
                return false;
            }
            if (s.length() - 1 > f && b > 0) {

                return palindrome(s, f + 1, b - 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abadd";
        System.out.println(longestPalindrome(s));

    }

}
