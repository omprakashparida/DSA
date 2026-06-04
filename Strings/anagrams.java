import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str = "care";
        String str1 = "acer";
        System.out.println(anagrams(str, str1));
        
    }
    public static boolean anagrams(String str,String str1){
        if (str.length()!=str1.length()) {
            return false;
        }
        char arr[]=str.toCharArray();
        char arr1[]= str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr, arr1);
    }
}
