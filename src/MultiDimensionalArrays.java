public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // array of arrays

        int[][] numbers = new int[3][3]; // 3X3 array

        numbers[0][0] = 10; // 1 row, 1 column
        numbers[2][1] = 50; // 3 row, 2 column

        int[][] matrix = {
                {1, 2, 3, 56},
                {4, 5, 6, 5656},
                {7, 8, 9, 7989}
        };

        System.out.println(matrix[2][0]);

        for (int i = 0; i < matrix.length; i++) { // loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // loop through columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line
        }
    }
}
