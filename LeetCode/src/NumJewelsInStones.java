
public class NumJewelsInStones {
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.contains(String.valueOf(S.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
