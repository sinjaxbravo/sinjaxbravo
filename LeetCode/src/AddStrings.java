
public class AddStrings {

    public String addStrings(String num1, String num2) {
        Long temp = Long.parseLong(num1);
        Long temp2 = Long.parseLong(num2);
        Long fin = temp + temp2;

        return String.valueOf(fin);

    }

    public static void main(String[] args) {
        System.out.println(12 % 23);

    }

}
