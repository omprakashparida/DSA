public class lengthOfString {
    public static void main(String[] args) {
        System.out.println(lengthOfString("Omprakash"));
        
    }
    public static int lengthOfString(String str ){
        if (str.length()==0) {
            return 0;
        }
        return 1 + lengthOfString(str.substring(1));
    }
}
