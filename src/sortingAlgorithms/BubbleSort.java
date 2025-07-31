package sortingAlgorithms;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length-1;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n-i ;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 4 , 7 , 6 , 1  , 3};
        bubbleSort(arr);
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}


// OPTIMISED BUBBLE SORT IN CASE OF NEARLY SORTED ARRAYS
/* public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length-1;
        for(int i = 0; i < n ; i++){
            boolean flag = false;
            for(int j = 0; j < n-i ;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) return;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,5,6};
        bubbleSort(arr);
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}*/
