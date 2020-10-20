import java.util.LinkedList;

public class NodeAddNumbersLeet {
    public LinkedList addTwoNumbers(LinkedList<Integer> l1,
            LinkedList<Integer> l2) {
        int sum1 = 0;
        int sum2 = 0;
        int size = l1.size();
        for (int i = 0; i < size; i++) {
            sum1 += l1.removeFirst();
        }
        size = l2.size();
        for (int i = 0; i < size; i++) {
            sum2 += l2.removeFirst();
        }

        String s = String.valueOf((sum1 + sum2));

        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            ll.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }

        return ll;

    }

    public static void main(String[] args) {

    }

}
