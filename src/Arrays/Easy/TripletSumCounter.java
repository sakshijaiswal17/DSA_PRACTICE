package Arrays.Easy;

import java.util.Scanner;

public class TripletSumCounter {
    public static int tripletSumCounter(int[] arr, int target){
        int counter = 0;
        for(int i = 0;i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        counter++;
                    }
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
        System.out.println("Total number of triplets whose sum is " + target + ": " + tripletSumCounter(arr,target));
    }
}
