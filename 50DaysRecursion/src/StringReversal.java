import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Simple HelloWorld program (clear of Checkstyle and FindBugs warnings).
 *
 * @author P. Bucci
 */
public final class StringReversal {

    public static String stringReversal(String s) {

        if (s.length() == 1) {
            return s;

        } else {
            String subS = stringReversal(s.substring(1));
            s = subS + s.charAt(0);
        }

        return s;

    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        String name = "jack burgdoerfer";
        System.out.println(stringReversal(name));

    }

}
