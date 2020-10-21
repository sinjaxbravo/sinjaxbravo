import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MajorityElement {

    public static List<Integer> majorityElement(int[] nums) {
        int cutOff = (nums.length / 3);
        LinkedList<Integer> list = new LinkedList<>();
        Arrays.sort(nums);

        int number = nums[0];
        int numOcc = 0;

        for (int i = 0; i < nums.length; i++) {
            if (number != nums[i]) {
                if (numOcc >= cutOff) {
                    list.add(number);

                }
                number = nums[i];
                numOcc = 1;
            } else {
                numOcc++;
            }
        }

        if (numOcc > cutOff) {
            list.add(number);
        }

        return list;

    }

    public static void main(String[] args) {
        int[] temp = { 3, 2, 3 };
        List<Integer> list = majorityElement(temp);
        list.forEach(e -> System.out.println(e));

    }

}
