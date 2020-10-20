
public class DivisionRecursionLeet {

    public static int divide(int dividend, int divisor) {
        if ((divisor * divisor) == 1) {
            if ((dividend < 0 || divisor < 0)
                    && (divisor > 0 || dividend > 0)) {
                return -(Math.abs(dividend));
            } else {
                return (int) (Math.sqrt(Math.pow(dividend, 2)));
            }
        }

        if ((dividend * dividend) == (divisor * divisor)) {
            if ((dividend < 0 || divisor < 0)
                    && (divisor > 0 || dividend > 0)) {
                return -1;
            } else {
                return 1;
            }

        } else if (dividend - Math.abs(divisor) < 0) {
            return 0;
        } else {
            if (divisor < 0) {
                return divide((dividend + divisor), divisor) - 1;
            } else {
                return divide((dividend - divisor), divisor) + 1;
            }

        }

    }

    public static void main(String[] args) {

        System.out.println(divide(2147483647, 2));

    }

}
