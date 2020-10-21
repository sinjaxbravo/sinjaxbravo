
public class ReverseInteger {

    public static int reverse(int x) {
        String temp = "";
        Long min = -2147483648L;
        Long max = 2147483647L;
        boolean negative = false;
        if (x < 0) {
            temp = reverseInt(String.valueOf(x * -1));
            if (Long.parseLong(temp) < min) {
                return 0;
            }
            negative = true;
        } else {
            temp = reverseInt(String.valueOf(x));
            if (Long.parseLong(temp) > max) {
                return 0;
            }
        }
        while (temp.charAt(0) == 0 && temp.length() > 1) {
            temp = temp.substring(1);

        }
        x = Integer.parseInt(temp);
        if (negative) {

            x *= -1;
        }

        return x;

    }

    public static String reverseInt(String x) {
        if (x.length() > 1) {
            x = reverseInt(x.substring(1)) + x.charAt(0);

        }

        return x;

    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(reverse(-12300));

    }

}
