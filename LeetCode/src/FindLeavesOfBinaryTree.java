import java.util.LinkedList;
import java.util.List;

public class FindLeavesOfBinaryTree {

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

    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        TreeNode temp = root;
        int j = 0;
        int height = height(temp);
        while (temp != null && height > 1) {
            height = height(temp);
            list.add(new LinkedList<Integer>());
            this.addToList(temp, height, list, j);
            j++;
        }

        return list;
    }

    public void addToList(TreeNode root, int i, List<List<Integer>> list,
            int j) {

        if (root.left == null && root.right == null) {
            list.get(j).add(root.val);
        }
        if (root.left != null) {
            this.addToList(root.left, i - 1, list, j);

        }
        if (root.right != null) {
            this.addToList(root.right, i - 1, list, j);

        }
        if (root.left != null && list.get(j).contains(root.left.val)) {

            root.left = null;

        }

        if (root.right != null && list.get(j).contains(root.right.val)) {

            root.right = null;

        }

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

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
