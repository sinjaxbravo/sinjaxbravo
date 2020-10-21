
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Total = 0;
        int l2Total = 0;
        ListNode temp = l1;
        while (temp != null) {
            l1Total += temp.val;
            temp = temp.next;
            if (temp != null) {
                l1Total *= 10;
            }
        }
        temp = l2;
        while (temp != null) {
            l2Total += temp.val;
            temp = temp.next;
            if (temp != null) {
                l2Total *= 10;
            }
        }

        String total = String.valueOf(l1Total + l2Total);
        ListNode ret = this.makeNew(total);

        return ret;

    }

    public ListNode makeNew(String total) {
        ListNode temp = new ListNode();
        if (total.length() > 0) {
            temp.next = this.makeNew(total.substring(1));
            temp.val = Integer.parseInt(String.valueOf(total.charAt(0)));
        }
        return temp;
    }

    public AddTwoNumbers.ListNode callIt() {
        ListNode a = new ListNode();
        a.val = 2;
        ListNode b = new ListNode();
        b.val = 3;
        ListNode c = new ListNode();
        c.val = 8;

        a.next = b;
        b.next = c;

        ListNode d = new ListNode();
        d.val = 2;
        ListNode e = new ListNode();
        e.val = 3;
        ListNode f = new ListNode();
        f.val = 8;

        d.next = e;
        e.next = f;

        ListNode temp = this.addTwoNumbers(a, d);
        return temp;

    }

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

}
