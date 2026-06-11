public class findPermutation {
public static void main(String[] args) {
    findPermutation("abc", "");
}   
public static void findPermutation(String str , String ans) {
    //base case
    if (str.equals("")) {
        System.out.println(ans);
        return;
    }
    for (int i = 0; i < str.length(); i++) {
        char curr = str.charAt(i);
        String newStr = str.substring(0, i)+str.substring(i+1);
        findPermutation(newStr, ans+curr);
    }
}
}
