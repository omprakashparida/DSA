public class reverseString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        String result = reverseString(str);
        System.out.println(result);
    }
    public static String reverseString(String str){
        char ch[] = str.toCharArray();
        int i =0;
        int j = ch.length-1;
        while (i<j) {
            char temp = ch[i];
            ch[i]= ch[j];
            ch[j] = temp;
            i++;
            j--;

        }
        return new String(ch);
    }
}
