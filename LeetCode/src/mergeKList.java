
public class mergeKList {

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

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length < 2) {
            return new ListNode();
        }
        ListNode x = lists[0];

        for (int i = 1; i < lists.length; i++) {
            ListNode temp1 = x;
            ListNode temp2 = lists[i];
            while (temp1.next != null && temp2.next != null) {
                int val1 = temp1.val;
                int val2 = temp2.val;
                if (val1 < val2) {
                    temp1 = temp1.next;
                } else {
                    ListNode z = x.next;
                    x.next = new ListNode(temp2.val);
                    x.next.next = z;
                    temp2 = temp2.next;
                }
            }
            if (temp1.next == null) {
                x.next = temp2;
            } else {
                x.next = temp1;
            }

        }

        return x;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
