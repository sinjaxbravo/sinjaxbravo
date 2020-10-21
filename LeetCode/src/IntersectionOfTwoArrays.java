import java.util.Stack;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Stack<Integer> tempStack = new Stack<>();
        String tempS = "";

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (!tempS.contains(String.valueOf(nums1[i]))
                        && nums1[i] == nums2[j]) {
                    tempStack.push(nums1[i]);
                    tempS += String.valueOf(nums1[i]);

                }

            }
        }

        int[] returnA = new int[tempStack.size()];

        int j = 0;
        while (tempStack.size() > 0) {
            returnA[j] = tempStack.pop();
            j++;
        }

        return returnA;

    }

    public static void main(String[] args) {
        int[] one = { 4, 9, 5 };
        int[] two = { 9, 4, 9, 8, 4 };
        int[] inter = intersection(one, two);
        for (int i : inter) {
            System.out.println(i);
        }

    }

}
