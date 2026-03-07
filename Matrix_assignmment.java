import java.util.Scanner;

class MatrixProgram {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("\nEnter The Dimension Of Your Square Matrix : ");
        int size = reader.nextInt();

        int[][] grid = new int[size][size];

        for (int row = 0; row < size; row++) {
            System.out.println("\nEnter The Elements Of Row " + (row + 1) + " :-");
            for (int col = 0; col < size; col++) {
                grid[row][col] = reader.nextInt();
            }
        }

        System.out.println("\nYour Entered Matrix Is :-");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < size; row++) {
            int rowTotal = 0;
            for (int col = 0; col < size; col++) {
                rowTotal = rowTotal + grid[row][col];
            }
            System.out.println("\nThe Sum Of Row " + (row + 1) + " = " + rowTotal);
        }

        for (int col = 0; col < size; col++) {
            int columnTotal = 0;
            for (int row = 0; row < size; row++) {
                columnTotal = columnTotal + grid[row][col];
            }
            System.out.println("\nThe Sum Of Column " + (col + 1) + " = " + columnTotal);
        }

        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int index = 0; index < size; index++) {
            mainDiagonalSum = mainDiagonalSum + grid[index][index];
            secondaryDiagonalSum = secondaryDiagonalSum + grid[index][size - 1 - index];
        }

        System.out.println("\nThe Sum Of Forward Diagonal = " + mainDiagonalSum);
        System.out.println("\nThe Sum Of Reverse Diagonal = " + secondaryDiagonalSum);
    }
}
