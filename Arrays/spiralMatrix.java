import java.util.*;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // print
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        spiralMatrix(matrix);
    }

    public static void spiralMatrix(int matrix[][]) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // for printing top 
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(matrix[startrow][i] + " ");
            }
            // for pritning right
            for (int j = startrow + 1; j <= endrow; j++) {
                System.out.print(matrix[j][endcol]+" ");
            }
            // bottom
        if (startrow != endrow) {

            for (int i = endcol - 1; i >= startcol; i--) {
                System.out.print(matrix[endrow][i] + " ");
            }
        }

        // left
        if (startcol != endcol) {

            for (int j = endrow - 1; j >= startrow + 1; j--) {
                System.out.print(matrix[j][startcol] + " ");
            }
        }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
}
