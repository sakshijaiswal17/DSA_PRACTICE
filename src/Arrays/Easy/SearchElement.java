package Arrays.Easy;

import java.util.Scanner;

public class SearchElement {
    public static boolean searchElement(int[] arr, int search){
        boolean found = false;
        for (int j : arr) {
            if (j == search) {
                found = true;
                break;
            }
        }
        return found;
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
        System.out.print("Enter the element to search : ");
        int search = scanner.nextInt();
        if(searchElement(arr, search)){
            System.out.println("Element Found");
        }else{
            System.out.println("Element not found");
        }
    }
}
