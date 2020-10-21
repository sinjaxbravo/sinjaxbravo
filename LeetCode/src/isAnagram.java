
public class isAnagram {
    public static boolean isAnagram(String s, String t) {
        boolean yes = true;
        for (int i = 0; i < t.length(); i++) {
            if (s.contains(String.valueOf(t.charAt(i)))) {
                s = s.substring(0, i) + s.substring(i, s.length());
            } else {
                yes = false;
            }
        }
        return yes;

    }

    public static void main(String[] args) {
        String temp = "cock";
        String temp1 = "ock";
        System.out.println(isAnagram(temp, temp1));

    }

}
