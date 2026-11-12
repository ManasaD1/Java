
public class test51 {
    public static void main(String[] args) {
        int size = 5;
        int[][] spiralMatrix = new int[size][size];

        int currentValue = 1;
        int topRow = 0;
        int bottomRow = size - 1;
        int leftCol = 0;
        int rightCol = size - 1;

        while (currentValue <= size * size) {
            for (int col = leftCol; col <= rightCol; col++) {
                spiralMatrix[topRow][col] = currentValue++;
            }
            topRow++;

            for (int row = topRow; row <= bottomRow; row++) {
                spiralMatrix[row][rightCol] = currentValue++;
            }
            rightCol--;

            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    spiralMatrix[bottomRow][col] = currentValue++;
                }
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    spiralMatrix[row][leftCol] = currentValue++;
                }
                leftCol++;
            }
        }

        for (int[] row : spiralMatrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
