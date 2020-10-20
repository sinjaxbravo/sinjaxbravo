
public class PalindromRecursion {

    public static boolean check(String front, String back) {
        if (front.length() == 0 && back.length() == 0) {
            return true;
        }

        if (front.charAt(0) != back.charAt(back.length() - 1)) {
            return false;
        } else {
            check(front.substring(1), back.substring(0, back.length() - 1));
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(check("jjack", "kcajj"));

    }

}
