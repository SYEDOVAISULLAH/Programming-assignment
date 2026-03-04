import java.util.Scanner;

class TwoDArrayAssignment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter Number Of Rows & Columns :-");
        int rows = input.nextInt();
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int matrixNumber = 1; matrixNumber <= 2; matrixNumber++) {

            System.out.println("\nEnter Matrix # " + matrixNumber + " (Row By Row) :");

            for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
                System.out.println("\nEnter values for Row " + (rowIndex + 1) + " :");

                for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                    matrix[rowIndex][columnIndex] = input.nextInt();
                }
            }

            System.out.println("\nMatrix " + matrixNumber + " is:");
            for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
                for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                    System.out.print(matrix[rowIndex][columnIndex] + " ");
                }
                System.out.println();
            }

            System.out.println("\nFor Matrix " + matrixNumber + " :-");

            for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
                int rowSum = 0;
                for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                    rowSum += matrix[rowIndex][columnIndex];
                }
                System.out.println("\nThe Sum Of Row " + (rowIndex + 1) + " = " + rowSum);
            }

            for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                int columnSum = 0;
                for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
                    columnSum += matrix[rowIndex][columnIndex];
                }
                System.out.println("\nThe Sum Of Column " + (columnIndex + 1) + " = " + columnSum);
            }

            if (rows == columns) {
                int forwardDiagonalSum = 0;
                int reverseDiagonalSum = 0;

                for (int i = 0; i < rows; i++) {
                    forwardDiagonalSum += matrix[i][i];
                    reverseDiagonalSum += matrix[i][rows - 1 - i];
                }

                System.out.println("\nThe Sum Of Forward Diagonal = " + forwardDiagonalSum);
                System.out.println("\nThe Sum Of Reverse Diagonal = " + reverseDiagonalSum);
            }
        }

        input.close();
    }
}
