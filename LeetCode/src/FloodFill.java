
public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc,
            int newColor) {

        if (image[sr][sc] != newColor) {
            color(image, sr, sc, image[sr][sc], newColor);
        }
        return image;
    }

    public static void color(int[][] image, int row, int column, int color,
            int newColor) {
        if (image[row][column] != color || row < 0 || column < 0
                || row >= image.length || column >= image[0].length) {

        } else if (image[row][column] == color) {

            image[row][column] = newColor;

            color(image, row - 1, column, color, newColor);

            color(image, row, column - 1, color, newColor);

            color(image, row + 1, column, color, newColor);

            color(image, row, column + 1, color, newColor);

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
