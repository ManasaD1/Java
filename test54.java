import java.util.Scanner;

public class test54 {
    private static final char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = 0;

        System.out.println("=== Tic-Tac-Toe ===");

        while (true) {
            printBoard();
            int slot = getValidMove(scanner);
            board[slot - 1] = currentPlayer;
            moves++;

            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (moves == 9) {
                printBoard();
                System.out.println("The game is a draw!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        scanner.close();
    }

    private static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    private static int getValidMove(Scanner scanner) {
        while (true) {
            System.out.print("Player " + currentPlayer + ", choose a slot (1-9): ");
            if (scanner.hasNextInt()) {
                int slot = scanner.nextInt();
                if (slot >= 1 && slot <= 9 && board[slot - 1] != 'X' && board[slot - 1] != 'O') {
                    return slot;
                }
            } else {
                scanner.next(); // Clear invalid non-integer input
            }
            System.out.println("Invalid move. Please choose an available number between 1 and 9.");
        }
    }

    private static boolean checkWin() {
        int[][] winConditions = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Rows
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columns
            {0, 4, 8}, {2, 4, 6}             // Diagonals
        };

        for (int[] condition : winConditions) {
            if (board[condition[0]] == currentPlayer &&
                board[condition[1]] == currentPlayer &&
                board[condition[2]] == currentPlayer) {
                return true;
            }
        }
        return false;
    }
}
