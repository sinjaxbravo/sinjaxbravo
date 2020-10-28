
public class RestoreString {
    public static String restoreString(String s, int[] indices) {
        StringBuilder temp = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            temp.deleteCharAt(indices[i]);
            temp.insert(indices[i], String.valueOf(s.charAt(i)));
        }

        return String.valueOf(temp);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] i = { 4, 5, 6, 7, 0, 2, 1, 3 };
        System.out.println(restoreString(s, i));

    }

}
