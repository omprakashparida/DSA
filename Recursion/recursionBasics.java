public class recursionBasics {
    public static void main(String[] args) {
        recursionBasics(10);
        print1ton(5);
        System.out.println(factorial(5));
        System.out.println(sum(5));
        System.out.println(fibo(5));
        int arr[] = {1,5,7,4,7,3,67,3,0,4};
        System.out.println(sort(arr, 0));
        System.out.println(firstOcc(arr, 3, 0));
        System.out.println(pow(2, 10));
    }

    public static void recursionBasics(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        recursionBasics(n - 1);
    }

    public static void print1ton(int n) {
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        print1ton(n-1);
        System.out.print(n +" ");
        
    }

    public static int factorial(int n){
      if(n==0){
        return 1;
      }
      return n*factorial(n-1);
}

public static int sum(int n){
    if(n==1){
        return 1;
    }
    return n+sum(n-1);
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static boolean sort(int arr[],int i){
        if (i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return sort(arr, i+1);

    }
    public static int firstOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int found  = lastOcc(arr, key, i+1);
        if (found ==-1 && arr[i]==key){
            return i;
        }
        return found;
    }
    public static int pow(int x,int n){
        if (n==0) {
            return 1;
        }
        return x*pow(x, n-1);
    }
}
