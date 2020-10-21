import java.util.Stack;

public class ReversedWords {

    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        int temp = 0;
        String newString = "";
        if (s.isEmpty()) {
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                stack.add(s.substring(temp, i + 1));
                temp = i;
            }

        }

        int stackSize = stack.size();

        for (int i = 0; i < stackSize; i++) {
            StringBuilder sB = new StringBuilder(stack.pop());
            while (sB.indexOf(" ") != -1) {
                sB.deleteCharAt(sB.indexOf(" "));
            }

            if (i < stackSize - 1) {
                if (String.valueOf(sB).length() > 0) {
                    newString += String.valueOf(sB) + " ";
                }

            } else {
                newString += String.valueOf(sB);
            }

        }
        StringBuilder finalize = new StringBuilder(newString);
        while (finalize.charAt(finalize.length() - 1) == ' ') {
            finalize.deleteCharAt(finalize.length() - 1);
        }

        return String.valueOf(finalize);

    }

    public static void main(String[] args) {
        System.out.println(reverseWords(""));

    }

}
