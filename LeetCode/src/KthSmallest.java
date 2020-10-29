import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallest {

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

    public static int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        makeTree(root, list);
        Collections.sort(list);
        return list.get(k + 1);

    }

    public static void makeTree(TreeNode root, List<Integer> l) {
        if (root != null) {
            l.add(root.val);

            if (root.left != null) {
                makeTree(root.left, l);
            }
            if (root.right != null) {
                makeTree(root.right, l);
            }

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
