
public class MinimumFactorizationLeetCode {

    public static int smallestFactorization(int a) {
        String s = String.valueOf(a);
        int num;
        if (s.length() > 2) {
            num = findIt(a, 100);
        }
        if (s.length() > 3) {
            num = findIt(a, 1000);
        } else {
            num = findIt(a, 1);
        }

        return num;
    }

    public static int findIt(int a, int num) {

        String s = String.valueOf(num);
        int number = Integer.parseInt(String.valueOf(s.charAt(0)));
        if (s.length() > 1) {
            for (int i = 1; i < s.length(); i++) {
                number *= Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        if (number == a) {
            return num;
        } else {
            return findIt(a, num + 1);
        }

    }

    public static void main(String[] args) {
        int smallest = smallestFactorization(125);
        System.out.println(smallest);

    }

}
