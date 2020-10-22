
public class SplitAStringinBalancedStrings {
    public static int balancedStringSplit(String s) {
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for (int i = 0; i < sb.length() - 1; i++) {
            if ((sb.charAt(i) == 'L' && sb.charAt(i + 1) == 'R')
                    || (sb.charAt(i) == 'R' && sb.charAt(i + 1) == 'L')) {
                count++;
                sb.delete(0, i + 2);
                i = -1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRRLLRLL"));

    }

}
