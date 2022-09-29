public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[][] num = { { 1, 2, 3 }, { 5, 6 } };

        print2DArray(num);

        int[][] matrix = { { 2, 3 }, { }, { 8, 9 } };
        // int[][] matrix = { { 2, 3 }, { 5, 6 }, { 8, 9 } };

        int[] myCol = getColumn(matrix, 0);
        System.out.println("Printing the col");
        print1DArray(myCol);

    }

    public static int[] getColumn(int[][] matrix, int col) {

        if (matrix == null) {// col is larger than the matrix size or matrix is empty
            return null;
        }
        if (matrix[0] == null) { // check if the matrix 2d is not null
            return null;
        }
        if (col >= matrix[0].length || col < 0) {// return an error since col is larger than columns size, we chececk
                                                 // for -ve value
            return null;
        }
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) { // if it was not a matrix, can I check it here
            // if not a matrix, you have to check, lloop by loop if the value is null
            if (matrix[i].length <= col) {
                arr[i] = -1;//desginer choice but find a way to tell me it it not populated
            } else {
                arr[i] = matrix[i][col];
            }
        }

        return arr;
    }

    public static void print1DArray(int[] num) {
        if (num == null) {
            return;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

    }

    public static void print2DArray(int[][] num) {
        if (num == null) {
            return;
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
