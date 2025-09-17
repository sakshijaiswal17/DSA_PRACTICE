package Arrays.Easy;

import java.util.Scanner;

public class CountOccurrence {
    public static int countOccurrence(int[] arr, int element){
        int count = 0;
        for (int j : arr) {
            if (j == element) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter " + size + " elements of array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to count it's occurrence : ");
        int element = scanner.nextInt();
        System.out.println(element + " occurred " + countOccurrence(arr, element) + " times");
    }
}
