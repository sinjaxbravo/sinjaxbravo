import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        makeList(root, list);

        return list;

    }

    public static void makeList(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            if (root.left != null) {
                makeList(root.left, list);
            }
            if (root.right != null) {
                makeList(root.right, list);
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
