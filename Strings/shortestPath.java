public class shortestPath {
    public static void main(String[] args) {
        String str = "NS";
        System.out.println(shortestPath(str));
    }

    public static float shortestPath(String str) {
        int y = 0, x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else {
                x++;
            }

        }
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(y2 + x2);
    }
}
