import org.junit.Test;

public class ListNodeTest {

    @Test
    public void test() {
        PalindromeLinkedList test = new PalindromeLinkedList();
        ListNode testNode1 = new ListNode();
        testNode1.val = 3;
        ListNode testNode2 = new ListNode();
        testNode2.val = 5;
        ListNode testNode3 = new ListNode();
        testNode3.val = 1;
        ListNode testNode4 = new ListNode();
        testNode4.val = 5;
        ListNode testNode5 = new ListNode();
        testNode5.val = 1;
        testNode1.next = testNode2;
        testNode2.next = testNode3;
        testNode3.next = testNode4;
        testNode4.next = testNode5;

        test.isPalindrome(testNode1);

    }

}
