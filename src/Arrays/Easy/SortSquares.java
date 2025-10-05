package Arrays.Easy;

import java.util.Scanner;

public class SortSquares {

    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        int k = n-1;
        while (left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
            }else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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

        System.out.print("Enter " + size + " elements of array (non-decreasing order) : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Original Array: ");
        printArray(arr);
        int[] ans = sortSquares(arr);
        System.out.println();
        System.out.print("Sorted Array: ");
        printArray(ans);
    }
}
