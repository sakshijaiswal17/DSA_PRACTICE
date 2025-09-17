package Arrays.Easy;

import java.util.Scanner;

public class CountGreaterThanX {
    public static int countGreaterThanX(int[] arr, int element){
        int count = 0;
        for (int j : arr) {
            if (j > element) {
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
        System.out.print("Enter X : ");
        int element = scanner.nextInt();
        System.out.println(countGreaterThanX(arr, element) + " elements are greater than " + element);
    }
}
