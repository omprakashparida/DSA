public class nQueens {
    public static void main(String[] args) {
        int n= 4;
        char board [] [] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }

    public static void nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board.length; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                // place
                board[row][col] = 'Q';
                // recurse
                nQueens(board, row + 1);
                // backtrack
                board[row][col] = 'X';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {

        // upper column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

}
