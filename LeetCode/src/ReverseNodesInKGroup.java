import java.util.ArrayList;
import java.util.List;

public class ReverseNodesInKGroup {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode start = head;
        List<ListNode> l = new ArrayList<>();
        while (head != null) {
            int j = k;
            while (j > 0) {
                temp = temp.next;
                j--;
            }
            ListNode next = temp.next;
            temp.next = null;
            reverse(start, l);
            ListNode n = this.makeNew(l);

        }

        return head;

    }

    public ListNode makeNew(List<ListNode> list) {
        ListNode ln = new ListNode(list.get(0).val);
        ListNode temp = ln;
        for (int i = 1; i < list.size(); i++) {
            temp.next = list.get(i);
            temp = temp.next;
        }

        return ln;
    }

    public static void reverse(ListNode ln, List<ListNode> list) {

        if (ln != null) {
            reverse(ln.next, list);
            list.add(ln);
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
