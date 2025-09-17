package Arrays.Easy;

import java.util.Scanner;

public class IsSorted {
    public static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i + 1]) {
                check = false;
                break;
            }
        }
        return check;
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
        if(isSorted(arr)){
            System.out.println("Yes, array is sorted");
        }
        else{
            System.out.println("No, array is not sorted");
        }
    }
}
