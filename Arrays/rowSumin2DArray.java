public class rowSumin2DArray {
    public static void main(String[] args) {
        int nums[][] = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        System.out.println(rowSumin2DArray(nums));
    }
    public static int rowSumin2DArray(int nums[][]){

        int row = 1;
        int col = nums[0].length - 1;
    
        int sum = 0;
    
        while(col >= 0){
    
            sum += nums[row][col];
            col--;
        }
    
        return sum;
    }
}
