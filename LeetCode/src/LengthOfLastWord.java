
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s.length() > 0) {
            int index = s.lastIndexOf(' ');
            int last = s.substring(index).length() - 1;
            return last;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
