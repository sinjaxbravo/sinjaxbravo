import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {

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

    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode temp = root;
        TreeNode tempL = root.left;
        TreeNode tempR = root.right;
        boolean b = isValid(root);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        left.add(root.val);
        right.add(root.val);

        boolean tR = findFloorRight(tempR, right);
        boolean tL = findFloorLeft(tempL, left);
        if (!tR || !tL) {
            b = false;
        }

        return b;
    }

    public static boolean findFloorRight(TreeNode root, List<Integer> l) {
        boolean temp = true;
        if (root != null) {
            l.add(root.val);
            for (int i = 0; i < l.size(); i++) {
                if (root.val <= l.get(i)) {
                    temp = false;
                }
            }
            if (root.left != null && temp) {
                temp = findFloorRight(root.left, l);
            }

        }

        return temp;

    }

    public static boolean findFloorLeft(TreeNode root, List<Integer> l) {
        boolean temp = true;
        if (root != null) {
            l.add(root.val);
            for (int i = 0; i < l.size(); i++) {
                if (root.val <= l.get(i)) {
                    temp = false;
                }
            }
            if (root.right != null && temp) {
                temp = findFloorLeft(root.right, l);
            }
        }

        return temp;

    }

    public static boolean isValid(TreeNode root) {

        boolean temp = true;

        if (root != null) {
            int rootV = root.val;

            if (root.left != null) {
                int lV = root.left.val;
                if (lV >= rootV) {
                    temp = false;
                }
                if (temp) {
                    temp = isValid(root.left);
                }
            }

            if (root.right != null) {
                int rV = root.right.val;
                if (rV <= rootV) {
                    temp = false;
                }
                if (temp) {
                    temp = isValid(root.right);
                }
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
