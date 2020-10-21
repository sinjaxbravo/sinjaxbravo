public class RemoveVowels {
    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiou";

        for (int i = 0; i < S.length(); i++) {
            if (-1 == vowels.indexOf(S.charAt(i))) {
                sb.append(S.charAt(i));
            }
        }

        return String.valueOf(sb);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
