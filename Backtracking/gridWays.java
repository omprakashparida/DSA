public class gridWays {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(gridWays(0, 0, n, m));
    }

    public static int gridWays(int row, int col, int n, int m) {
        // base case
        if (row == n - 1 && col == m - 1) {
            return 1;
        }
        if (row == n || col == m) {
            return 0;
        }
        return gridWays(row, col + 1, n, m)
                + gridWays(row + 1, col, n, m);
    }
}
