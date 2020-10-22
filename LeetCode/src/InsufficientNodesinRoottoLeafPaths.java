
public class InsufficientNodesinRoottoLeafPaths {

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

    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if (root != null) {
            if (root.val < limit) {

                root = null;
            }
            root.left = this.sufficientSubset(root.left, limit);
            root.right = this.sufficientSubset(root.right, limit);

        }
        return root;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
