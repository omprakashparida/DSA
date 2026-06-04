public class transpose2Darray {
    public static void main(String[] args) {
        int nums[][] = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        transpose2Darray(nums);
    }
    
    public static void transpose2Darray(int nums[][]){
        int transpose [][] = new int [nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                transpose[j][i]=nums[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
