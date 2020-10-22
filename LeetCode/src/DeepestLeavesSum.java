
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

    public static int deepestLeavesSum(TreeNode root) {
        int sum = 0;
        if (root.left != null) {
            sum += deepestLeavesSum(root.left);

        }
        if (root.right != null) {
            sum += deepestLeavesSum(root.right);
        } else {
            sum += root.val;
        }

        return sum;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
