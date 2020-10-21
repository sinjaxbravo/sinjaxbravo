import java.util.HashMap;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        StringBuilder tempSB = new StringBuilder(s);
        boolean valid = false;
        if (s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {
                //valid = shorten(s.substring(1), s.charAt(0), map);
                int j = s.length();
                int holder = s.length();
                while (j > 0 && holder >= 1) {
                    valid = shorten(s.substring(1, holder), s.charAt(0), map);
                    if (valid) {
                        j = 0;
                        tempSB.deleteCharAt(holder - 1);
                        tempSB.deleteCharAt(i);
                        s = String.valueOf(tempSB);
                    } else {
                        holder--;
                    }

                }

            }
        } else {
            valid = false;
        }
        return valid;

    }

    public static boolean shorten(String s, char x,
            HashMap<Character, Character> m) {
        boolean temp = false;

        if (s.length() > 1) {
            temp = shorten(s.substring(1), x, m);
        } else {
            return m.get(x) == s.charAt(0);
        }
        return temp;
    }

    public static void main(String[] args) {
        String temp = "({))";
        System.out.println(isValid(temp));

    }

}
