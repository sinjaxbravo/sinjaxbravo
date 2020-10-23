public class DeepestLeavesSum {

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

    public int deepestLeavesSum(TreeNode root) {
        TreeNode copy = root;
        int height = height(copy);
        int sum = this.makeSum(root, height);

        return sum;
    }

    public int makeSum(TreeNode root, int i) {
        int sum = 0;
        if (root.left != null) {
            sum += this.makeSum(root.left, i - 1);
        }
        if (root.right != null) {
            sum += this.makeSum(root.right, i - 1);
        }

        else if (root.left != null && root.right != null && i == 0) {
            sum += root.val;
        }

        return sum;

    }

    public static int height(TreeNode root) {
        int height = 1;
        int leftHeight = 0;
        int rightHeight = 0;
        if (root.left != null) {
            leftHeight = height(root.left);
        }
        if (root.right != null) {
            rightHeight = height(root.right);
        }
        if (rightHeight > leftHeight) {
            height += rightHeight;
        } else {
            height += leftHeight;
        }
        return height;
    }

}
