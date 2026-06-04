public class tillingProblem {

    public static void main(String[] args) {
        System.out.println(tillingProblem(3));
    }
    public static int tillingProblem(int n){
        if (n==0 || n==1) {
            return 1;
        }
        return tillingProblem(n-1)+tillingProblem(n-2);
}

}