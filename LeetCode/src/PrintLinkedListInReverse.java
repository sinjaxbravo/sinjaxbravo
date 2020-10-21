
public class PrintLinkedListInReverse {
    interface ImmutableListNode {
        public void printValue(); // print the value of this node.

        public ImmutableListNode getNext(); // return the next node.
    };

    public static void printLinkedListInReverse(ImmutableListNode head) {
        if (head.getNext() != null) {
            printLinkedListInReverse(head.getNext());
            head.printValue();
        } else {
            head.printValue();
        }
    }

    public static void main(String[] args) {

    }

}
