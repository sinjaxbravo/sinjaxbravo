import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class verticalOrder {

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

    public List<List<Integer>> verticalOrder(TreeNode root) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        getColumn(root, 0, map);

        HashSet<Integer> set = new HashSet<>();
        set.addAll(map.keySet());
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            l.add(i, map.remove(list.get(i)));
        }

        return l;

    }

    public static void getColumn(TreeNode root, int i,
            HashMap<Integer, List<Integer>> map) {

        if (root != null) {

            if (!map.containsKey(i)) {
                map.put(i, new ArrayList<>());
            }
            map.get(i).add(map.get(i).size(), root.val);

            if (root.left != null) {

                getColumn(root.left, i - 1, map);
            }

            if (root.right != null) {

                getColumn(root.right, i + 1, map);
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
