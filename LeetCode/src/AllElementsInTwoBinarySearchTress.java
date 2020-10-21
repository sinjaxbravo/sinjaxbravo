import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllElementsInTwoBinarySearchTress {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> lst = new ArrayList<>();
        if (root1 != null) {

            lst.add(root1.val);

            lst.addAll(this.getAllElements(root1.left, root1.right));

        }

        if (root2 != null) {

            lst.add(root2.val);

            lst.addAll(this.getAllElements(root2.left, root2.right));

        }

        Collections.sort(lst);

        return lst;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
