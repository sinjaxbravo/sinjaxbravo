
public class MinimumRemovetoMakeValidParenthesesLeetCode {
    public static String minRemoveToMakeValid(String s) {
        String temp = "";
        int i = remove(s, 0);
        int k = i;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(' && i > 0 && s.charAt(j + 1) == ')') {
                temp += String.valueOf(s.charAt(j));
                i--;
                if (s.charAt(j + 1) == ')') {
                    temp += String.valueOf(s.charAt(j + 1));
                    k--;
                }
            }

        }
        System.out.println(s);

        return temp;

    }

    public static int remove(String s, int count) {
        if (s.length() == 1) {
            System.out.println(count);
            return count;
        }

        else if (s.charAt(0) == '(' && s.contains(")")) {
            if (s.charAt(1) == ')') {
                return remove(s.substring(2), count + 1);
            } else {
                return remove(s.substring(1, s.lastIndexOf(')')), count + 1);
            }

        } else {
            return remove(s.substring(1), count);
        }

    }

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));

    }

}
