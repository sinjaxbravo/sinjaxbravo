import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringPermutations {

    public static void generateString(String s, int start, int stop) {
        if (start == stop) {

            System.out.println(s);

        } else {
            for (int i = start; i < stop; i++) {
                String swapped = swap(s, start, i);

                generateString(swapped, start + 1, stop);
            }
        }
    }

    public static String swap(String s, int start, int stop) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[start];
        charArray[start] = charArray[stop];
        charArray[stop] = temp;

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> set = new HashSet<String>();
        System.out.print("Enter a string to permutate: ");
        String s = in.nextLine();
        generateString(s, 0, s.length());

    }

}
