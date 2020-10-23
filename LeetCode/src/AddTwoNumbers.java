
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long l1Total = 0;
        long l2Total = 0;
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
        StringBuilder one = new StringBuilder(String.valueOf(l1Total));
        StringBuilder two = new StringBuilder(String.valueOf(l2Total));
        if (one.length() > two.length()) {
            while (one.length() > two.length()) {
                two.insert(0, 0);
            }
        } else if (one.length() < two.length()) {
            while (one.length() < two.length()) {
                one.insert(0, 0);
            }
        }
        String total = String.valueOf(Long.parseLong(String.valueOf(one))
                + Long.parseLong(String.valueOf(two)));
        ListNode ret = this.makeNew(total);
        return ret;

    }

    public ListNode makeNew(String total) {
        if (total.length() > 0) {
            ListNode temp = new ListNode();
            temp.next = this.makeNew(total.substring(0, total.length() - 1));
            temp.val = Integer
                    .parseInt(String.valueOf(total.charAt(total.length() - 1)));
            return temp;
        }
        return null;
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
