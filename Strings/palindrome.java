public class palindrome {
    public static void main(String[] args) {
        String str ="maaym";
        System.out.println(palindrome(str));
       
       
    }
    public static boolean palindrome(String str){
         for (int i = 0; i < str.length()/2; i++) {
            if((str.charAt(i)!=str.charAt(str.length()-1-i))){
                return false;
            }
        }
        return true;
    }
}
