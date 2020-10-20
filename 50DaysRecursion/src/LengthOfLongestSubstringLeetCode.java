
public class LengthOfLongestSubstringLeetCode {
    public static int lengthOfLongestSubstring(String s) {

        if (s.length() > 2) {

            return shrink(s.substring(1), s.charAt(0), 0, 0);

        } else if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1) ? 1 : 2;

        } else {
            return s.length();
        }

    }

    public static int shrink(String s, char c, int longest, int len) {

        if (s.length() == 0) {

            if (longest >= len) {
                len = longest;
            }

            return len;
        }
        if (s.indexOf(c) == -1) {
            if (longest == 0) {
                int i = 0;
                len += 1;
                boolean is = true;
                while (is) {
                    if (s.substring(1).lastIndexOf(s.charAt(i)) == -1) {
                        len += 1;
                        i++;
                    } else {
                        is = false;
                    }
                }

                longest = 0;
                return shrink(s.substring(1), s.charAt(0), longest, len);
            } else {
                return shrink(s.substring(1), s.charAt(0), longest + 1, len);
            }

        } else {
            int j = s.indexOf(c);
            if (j >= len) {
                if (j == 0) {
                    len = j;
                } else {
                    len = j + longest;
                }

            }
            if (longest > len) {
                len = longest;
            }

            longest = 0;
            return shrink(s.substring(1), s.charAt(0), longest + 1, len);
        }

    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String s1 = "bbbbb";
        String s2 = "pwwkew";
        String s4 = "abc";
        String s3 = "au";
        String s5 = "uqinntq";
        int i = lengthOfLongestSubstring(s4);
        System.out.println(i);

    }
}
