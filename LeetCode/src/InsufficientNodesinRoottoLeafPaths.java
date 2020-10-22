
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

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode t = this.makeTree(preorder, 0);
        return t;
    }

    public TreeNode makeTree(int[] preorder, int i) {
        TreeNode t = new TreeNode();
        if (i < preorder.length) {
            t.val = preorder[i];
            t.left = this.makeTree(preorder, i * 2 + 1);
            t.right = this.makeTree(preorder, i * 2 + 2);

        }
        return t;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
