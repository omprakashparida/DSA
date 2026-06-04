public class selectionSort {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        printarr(arr);
        
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[]){
        
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                //compare with each elemnt of array
                if (arr[j]<arr[min]) {
                    min=j;
                }
                   
                }
                //swap
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
            
        }
    }
