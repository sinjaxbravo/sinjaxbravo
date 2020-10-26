
public class maxAreaOfIsland {

    public static int maxAreaOfIsland(int[][] grid) {

        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int temp = area(grid, i, j);
                if (temp > max) {
                    max = temp;
                }
            }
        }

        return max;
    }

    public static int area(int[][] grid, int i, int j) {
        int size = 0;
        if (grid[i][j] == 1) {
            grid[i][j] = 0;
            size = 1;
            if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                size += area(grid, i, j + 1);
            }
            if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                size += area(grid, i + 1, j);
            }
            if (j > 0 && grid[i][j - 1] == 1) {
                size += area(grid, i, j - 1);
            }
            if (i > 0 && grid[i - 1][j] == 1) {
                size += area(grid, i - 1, j);
            }
        }

        return size;
    }

    public static void main(String[] args) {
        int[][] i = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 },
                { 0, 0, 0, 1, 1 } };
        System.out.println(maxAreaOfIsland(i));

    }

}
