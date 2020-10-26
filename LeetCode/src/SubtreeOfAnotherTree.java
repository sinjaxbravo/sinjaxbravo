
public class SubtreeOfAnotherTree {

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

    class Solution {
        public boolean isSubtree(TreeNode s, TreeNode t) {
            boolean status = true;
            if (s != null && t != null) {
                status = false;
                if (s.val == t.val) {
                    status = true;
                    boolean tempL = this.isSubtree(s.left, t.left);
                    boolean tempR = this.isSubtree(s.right, t.right);
                    if (!tempL || !tempR) {
                        status = false;
                    }
                } else {
                    boolean tempL = this.isSubtree(s.left, t);
                    boolean tempR = this.isSubtree(s.right, t);
                    if (tempL || tempR) {
                        status = true;
                    }

                }

            }

            return status;

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
