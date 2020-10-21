import java.util.Arrays;

public class ReverseString {

    public static char[] reverseString(char[] s) {
        String temp = Arrays.toString(s);
        String temp1 = reverse(temp.substring(1, temp.length() - 1));
        System.out.println(temp1);

        return temp1.toCharArray();
    }

    public static String reverse(String s) {

        if (s.length() > 1) {
            s = reverse(s.substring(1)) + s.charAt(0);
        }

        return s;
    }

    public static void main(String[] args) {
        char[] temp = { 'j', 'a', 'c', 'k' };
        System.out.println(reverseString(temp));

    }

}
