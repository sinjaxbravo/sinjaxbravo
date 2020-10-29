import java.util.ArrayList;
import java.util.List;

public class InOrderSuccessor {

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

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode temp = root;
        if (root == null) {
            return null;
        } else {
            List<Integer> list = new ArrayList<>();
            makeList(temp, list);
            int pV = p.val;
            int v = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == pV) {
                    if (i < list.size() - 1) {
                        v = i + 1;
                    } else {
                        return null;
                    }

                }
            }

            TreeNode t = this.getTree(root, list.get(v));
            return t;

        }

    }

    public TreeNode getTree(TreeNode root, int i) {
        TreeNode t = new TreeNode();
        if (root != null) {
            if (root.val == i) {
                t = root;

            }

            if (root.left != null) {
                t = this.getTree(root.left, i);
            }

            if (root.right != null) {
                t = this.getTree(root.right, i);
            }
        }

        return t;
    }

    public static void makeList(TreeNode root, List<Integer> list) {
        if (root != null) {

            if (root.left != null) {
                makeList(root.left, list);
            }
            list.add(root.val);
            if (root.right != null) {
                makeList(root.right, list);
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
