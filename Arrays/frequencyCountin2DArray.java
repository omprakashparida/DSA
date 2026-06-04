public class frequencyCountin2DArray {
    public static void main(String[] args) {
        int[][] array = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        int key = 7;
        System.out.println(frequencyCountin2DArray(array, key));
    }

    public static int frequencyCountin2DArray(int array[][], int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= array[0].length - 1; j++) {
                if (array[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }
}