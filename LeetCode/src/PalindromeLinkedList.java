
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode depthNode = head;
        int depth = this.reverseDepth(depthNode);
        boolean status = true;
        while (depth > 0) {
            int test = temp.val;
            ListNode temp1 = this.reverse(temp, depth);
            int test1 = temp1.val;
            if (temp1.val != temp.val) {
                //return false;
            } else {
                test = temp.val;
                temp = head.next;
            }
            depth--;
            System.out.println(temp.val);
        }
        return status;

    }

    public ListNode reverse(ListNode head, int i) {
        ListNode temp = head;
        if (temp.next != null) {
            i++;

            head = this.reverse(head.next, i);
            if (temp.next.next == null) {
                temp.next = null;
            }
            int test = head.val;
        }
        return head;
    }

    public int reverseDepth(ListNode head) {
        ListNode temp = head;
        int i = 1;
        if (temp.next != null) {
            i += this.reverseDepth(head.next);

        }
        return i;
    }

}
