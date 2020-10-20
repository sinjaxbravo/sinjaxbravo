
public class myATOILEETCODE {

    public static int myAtoi(String str) {
        boolean alreadyDigit = false;
        String nums = "+ -0123456789";
        String justNums = "0123456789";
        boolean decimal = false;
        String digit = "";
        if (str.isEmpty() || str.isBlank()) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!nums.contains(String.valueOf(str.charAt(i)))
                    && alreadyDigit == false) {
                return 0;

            }
            if (nums.contains(String.valueOf(str.charAt(i)))
                    && decimal == false) {
                digit += String.valueOf(str.charAt(i));
                alreadyDigit = true;
            }
            if (alreadyDigit = false
                    && String.valueOf(str.charAt(i)).equals(".")
                    || (alreadyDigit = false && (alreadyDigit && !justNums
                            .contains(String.valueOf(str.charAt(i)))))) {

                decimal = true;
            }

        }

        StringBuilder temp = new StringBuilder(digit);

        if (temp.indexOf("+") != -1 && temp.indexOf("-") != -1) {
            return 0;
        }

        for (int i = temp.length() - 1; i >= 0; i--) {
            if (temp.charAt(i) == ' ') {
                temp.deleteCharAt(i);
            }
        }

        if (temp.length() < 1 || !justNums
                .contains(String.valueOf(temp.charAt(temp.length() - 1)))) {
            return 0;
        }

        if (Integer.MAX_VALUE < Double.parseDouble(String.valueOf(temp))) {
            return Integer.MAX_VALUE;
        }
        if (Integer.MIN_VALUE > Double.parseDouble(String.valueOf(temp))) {
            return Integer.MIN_VALUE;
        }

        return Integer.parseInt(String.valueOf(temp));
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("  -0012a42"));
    }

}
