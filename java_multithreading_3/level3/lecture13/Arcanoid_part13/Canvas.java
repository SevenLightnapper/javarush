package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part13;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.height = height;
        this.width = width;
        this.matrix = new char[height+2][width+2];
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public void setPoint(double x, double y, char c){
        if (!(x < 0 || y < 0 || y >= matrix.length || x >= matrix.length)) {
            matrix[(int) Math.round(y)][(int) Math.round(x)] = c;
        }
    }
    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    setPoint(x+j, y+i, c);
            }
        }
    }
    public void clear() {
        this.matrix = new char[height + 2][width + 2];
    }
    public void print() {
        for (int i = 0; i < getHeight() + 2; i++) {
            for (int j = 0; j < getWidth() + 2; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}


