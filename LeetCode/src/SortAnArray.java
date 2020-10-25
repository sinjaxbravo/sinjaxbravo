
public class SortAnArray {

    public static int[] sortArray(int[] nums) {
        beginSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static int[] beginSort(int[] nums, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(nums, begin, end);
            beginSort(nums, begin, partitionIndex - 1);
            beginSort(nums, partitionIndex + 1, end);
        }

        return nums;
    }

    public static int partition(int[] nums, int begin, int end) {
        int pivot = nums[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (nums[j] <= pivot) {
                i++;

                int swapTemp = nums[i];
                nums[i] = nums[j];
                nums[j] = swapTemp;
            }
        }

        int swapTemp = nums[i + 1];
        nums[i + 1] = nums[end];
        nums[end] = swapTemp;

        return i + 1;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
