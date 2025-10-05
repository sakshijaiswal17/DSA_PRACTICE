package Arrays.Easy;

import java.util.Scanner;

public class SortArrayByParity {
    static void sortArrayByParity(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        while (left < right){
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0){
                left++;
            }
            if (arr[right] % 2 == 1){
                right--;
            }
        }
    }

    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

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

        System.out.print("Enter " + size + " elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Original Array: ");
        printArray(arr);
        sortArrayByParity(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
