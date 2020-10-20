
public class FindTheDifferenceLeetCode {

    public static char findTheDifference(String s, String t) {
        if (s.length() > t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (!t.contains(String.valueOf(s.charAt(i)))) {
                    return s.charAt(i);
                }
            }
        } else {
            for (int i = 0; i < t.length(); i++) {
                if (!s.contains(String.valueOf(t.charAt(i)))) {
                    return t.charAt(i);

                }
            }
        }

        if (s.length() > t.length()) {
            return s.charAt(0);
        } else {
            return t.charAt(0);
        }

    }

    public static boolean test(int n) {
        for (int i = 1; i < n; i++) {
            if (i * i * i == n) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(test(9));
    }

}
