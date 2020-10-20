
public class HouseRobberLeetCode {

    public static int rob(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int spacerSum = 0;
        int spacer = nums.length - 1;
        int[] temp = mergeSort(nums);
        String tempString = nums.toString();
        for (int i = 0; i < nums.length; i++) {
            String tLength = String.valueOf(nums[i]);
        }
        return -1;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] right;
        if ((array.length + 2) % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }
        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[midpoint + j];
        }

        int[] result = new int[array.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left, right);

        return result;

    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            //zip of if both have elements
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                } //end of else
            } //end of if
            else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } //end of elseIf
            else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        } //end of while

        return result;

    }

    public static void main(String[] args) {
        int[] temp = { 1, 3, 1, 3, 100 };
        rob(temp);
    }

}
