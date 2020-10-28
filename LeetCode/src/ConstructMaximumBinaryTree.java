import java.util.Arrays;

public class ConstructMaximumBinaryTree {
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

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length < 1) {
            return null;
        }
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        TreeNode root = new TreeNode(copy[copy.length - 1]);
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == copy[copy.length - 1]) {
                index = i;
            }
        }

        root.left = this.makeTree(Arrays.copyOf(nums, index), 0);
        root.right = this
                .makeTree(Arrays.copyOfRange(nums, index + 1, nums.length), 0);

        return root;

    }

    public TreeNode makeTree(int[] nums, int i) {
        TreeNode root = new TreeNode();
        if (i < nums.length) {

            if (nums.length > i + 1 && nums[i + 1] > nums[i]) {
                root.right = this.makeTree(nums, 1);
            } else if (nums.length > i + 1 && nums[i + 1] < nums[i]) {
                root.left = this.makeTree(nums, 1);
            }
            if (nums.length > i + 2 && nums[i + 2] > nums[i]) {
                root.right = this.makeTree(nums, 1);
            } else if (nums.length > i + 1 && nums[i + 2] < nums[i]) {
                root.left = this.makeTree(nums, 1);
            }
        }

        return root;

    }

    public static void main(String[] args) {
        int[] i = { 3, 2, 1, 6, 0, 5 };

    }

}
