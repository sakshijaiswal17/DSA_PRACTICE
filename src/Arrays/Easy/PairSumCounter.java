package Arrays.Easy;

import java.util.Scanner;

public class PairSumCounter {
    public static int pairSumCounter(int[] arr, int target){
        int counter = 0;
        for(int i = 0;i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    counter++;
                }
            }
        }
        return counter;
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
        System.out.print("Enter target element : ");
        int target = scanner.nextInt();
        System.out.println("Total number of pairs whose sum is " + target + ": " +pairSumCounter(arr,target));
    }
}
