public class searchInSortedMatrix {

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 4, 7, 11 },
                { 2, 5, 8, 12 },
                { 3, 6, 9, 16 },
                { 10, 13, 14, 17 }
        };
        int key = 12;
        System.out.println(searchInSortedMatrix(matrix,key));

    }
    public static boolean searchInSortedMatrix(int matrix[][],int key){
        int row =0;
        int col = matrix[0].length-1;
        while (row<matrix.length&&col>=0) {
            if(matrix[row][col]==key){
                System.out.println("Found at (" + row + "," + col + ")"); 
                return true;
            }else if (key<matrix[row][col]) {
                col--;
            }else{
                row++;
            }
            
        }
        System.out.println("Element not found!");
        return false;
    }
}