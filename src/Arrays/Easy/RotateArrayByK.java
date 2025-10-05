package Arrays.Easy;

import java.util.Scanner;

public class RotateArrayByK {
    public static int[] rotateArray(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i<n ; i++){
            ans[j++] = arr[i];
        }

        for(int i = 0; i<n-k-1 ; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static void printArray(int[] arr){
        System.out.print("rotated array: ");
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
        System.out.print("Enter K: ");
        int k = scanner.nextInt();
        int[] ans = rotateArray(arr,k);
        printArray(ans);
    }
}
