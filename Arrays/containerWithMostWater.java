public class containerWithMostWater {
    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height, 0, height.length - 1));
    }

    public static int maxArea(int height[], int start, int end) {
        int maxArea = 0;
        while (start < end) {
            int width = end - start;
            int min = Math.min(height[start], height[end]);
            int area = width * min;
            maxArea = Math.max(maxArea, area);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }

        }
        return maxArea;
    }

}
