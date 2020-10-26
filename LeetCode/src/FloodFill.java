
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int color = image[sr][sc];
        if (color != newColor) {
            this.dfs(image, sr, sc, color, newColor);
        }
        return image;
    }

    public void dfs(int[][] image, int row, int column, int color,
            int newColor) {
        if (image[row][column] == color) {
            image[row][column] = newColor;
            if (row >= 1) {
                this.dfs(image, row - 1, column, color, newColor);
            }
            if (column >= 1) {
                this.dfs(image, row, column - 1, color, newColor);
            }
            if (row < image.length - 1) {
                this.dfs(image, row + 1, column, color, newColor);
            }
            if (column < image[0].length - 1) {
                this.dfs(image, row, column + 1, color, newColor);
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
