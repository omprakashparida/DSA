public class sudoku {
    public static void main(String[] args) {
        char board[][] = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},

            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},

            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
    };

    if (!sudoku(board, 0, 0)) {
        System.out.println("No Solution Exists");
    }
    }
    public static void printBoard(char board[][]) {
        for (int i = 0; i < 9; i++) {
    
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------");
            }
    
            for (int j = 0; j < 9; j++) {
    
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
    
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean sudoku(char board[][], int row, int col) {
        if (row == 9) {
            printBoard(board);
            return true;
        }
        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (board[row][col] != '.') {
            return sudoku(board, nextRow, nextCol);
        } else {
            for (int digit = 1; digit <= 9; digit++) {
                if (isSafe(board, row, col, digit)) {
                    board[row][col] = (char) (digit + '0');

                    if (sudoku(board, nextRow, nextCol)) {
                        return true;
                    }

                    board[row][col] = '.';
                }

            }
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col, int digit) {
        // for row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == (char) (digit + '0')) {
                return false;
            }
        }

        // for coloumn
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char) (digit + '0')) {
                return false;
            }
        }

        // for grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (digit + '0')) {
                    return false;
                }
            }
        }
        return true;
    }
}
