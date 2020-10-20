
public class ReorderLogFilesLeetCode {
    public static void reorderLogFiles(String[] logs) {
        for (int i = 0; i < logs.length; i++) {
            for (int j = 0; j < logs.length - 1; j++) {
                String temp = logs[j];
                if (logs[j + 1].charAt(0) == 'l' && logs[j].charAt(0) == 'd') {
                    logs[j] = logs[j + 1];
                    logs[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < logs.length; i++) {
            for (int j = 0; j < logs.length - 1; j++) {
                String temp = logs[j];
                if (Integer.parseInt(
                        String.valueOf(logs[j + 1].charAt(3))) < Integer
                                .parseInt(String.valueOf(logs[j].charAt(3)))
                        && logs[j + 1].charAt(0) == logs[j].charAt(0)) {
                    logs[j] = logs[j + 1];
                    logs[j + 1] = temp;
                }
            }
        }

        for (String s : logs) {
            System.out.println(s);
        }

    }

    public static void main(String[] args) {
        String[] temp = { "dig1 8 1 5 1", "let1 art can", "dig2 3 6",
                "let2 own kit dig", "let3 art zero" };
        reorderLogFiles(temp);
    }

}
