import java.util.HashSet;
import java.util.Set;

import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Simple HelloWorld program (clear of Checkstyle and FindBugs warnings).
 *
 * @author P. Bucci
 */
public final class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> tempSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (tempSet.contains(nums[i])) {
                return true;
            } else {
                tempSet.add(nums[i]);
            }
        }

        return false;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        int[] temp = { 1, 2, -5, -4, 0 };

        System.out.println(containsDuplicate(temp));

    }

}
