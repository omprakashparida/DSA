public class getithbit {
public static void main(String[] args) {
 System.out.println(getithbit(10, 3));   
}
public static int getithbit(int n, int i){
    int bitMask = 1<<i;
    if ((n&bitMask)==0) {
        return 0;
    }
    return 1;
}
    
}