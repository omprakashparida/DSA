public class binaryStringProblem {
    public static void main(String[] args) {
        
    }
    public static void binaryStringProblem(int n , int lastPlace , String str){

        lastPlace = str.charAt(n);
        if (n==0 && n+1 == 1) {
            binaryStringProblem(n+1, lastPlace, str);
        }
    }
}
