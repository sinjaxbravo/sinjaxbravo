
public class RobotInAGrid {

    public static int grid(int c, int r, int forbiddenR, int forbiddenC) {
        if (c == 1 || r == 1) {
            return 1;
        } else {
            if (r - 1 == forbiddenR && c == forbiddenC) {
                return grid(c - 1, r, forbiddenR, forbiddenC);
            } else if (r == forbiddenR && c - 1 == forbiddenC) {
                return grid(c, r - 1, forbiddenR, forbiddenC);
            }

            else {
                return grid(c - 1, r, forbiddenR, forbiddenC)
                        + grid(c, r - 1, forbiddenR, forbiddenC);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(grid(3, 3, 3, 1));

    }

}
