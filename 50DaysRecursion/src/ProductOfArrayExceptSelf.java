public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        int total = 1;

        for (int i = 0; i < nums.length; i++) {
            total *= nums[i];

        }
        for (int j = 0; j < nums.length; j++) {
            temp[j] = total / nums[j];
        }

        return temp;

    }

    public static int multiplyIt4(int i, int j, int k, int z) {

        if (z == 1) {
            return multiplyIt3(i, j, k, z);
        } else {

            return multiplyIt3(i, j, k, z) + multiplyIt4(i, j, k, z - 1);

        }

    }

    public static int multiplyIt3(int i, int j, int k, int z) {

        if (k == 1) {
            return multiplyIt2(i, j, k, z);
        } else {

            return multiplyIt2(i, j, k, z) + multiplyIt3(i, j, k - 1, z);

        }

    }

    public static int multiplyIt2(int i, int j, int k, int z) {
        if (j == 1) {
            return i;
        } else {
            return i + multiplyIt2(i, j - 1, k, z);
        }

    }

    public static void main(String[] args) {

        System.out.println(multiplyIt4(3, 4, 3, 5));

    }

}
