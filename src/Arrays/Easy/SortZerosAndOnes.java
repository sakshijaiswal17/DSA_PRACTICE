package Arrays.Easy;

import java.util.Scanner;

public class SortZerosAndOnes {

    static void sortZerosAndOnes(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right){
            if (arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }
    }

    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    static void sortZerosAndOnes(int[] arr){
//        int n = arr.length;
//        int zeros = 0;
//        // count zeros
//        for (int j : arr) {
//            if (j == 0) {
//                zeros++;
//            }
//        }
//        // 0 to zeros-1 :- 0 , zeros to n-1 : 1
//        for (int i = 0; i < n ; i++){
//            if (i < zeros){
//                arr[i] = 0;
//            }else {
//                arr[i] = 1;
//            }
//        }
//    }

    public static void printArray(int[] arr){
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements of array (only 0 and 1) : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Original Array: ");
        printArray(arr);
        sortZerosAndOnes(arr);
        System.out.println();
        System.out.print("Sorted array: ");
        printArray(arr);
    }

}
