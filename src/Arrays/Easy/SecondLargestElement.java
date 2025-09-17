package Arrays.Easy;

import java.util.Scanner;

public class SecondLargestElement {
    public static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter " + size + " elements of array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Second largest element of array: " + findSecondMax(arr));
    }
}
