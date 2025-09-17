package Arrays.Easy;

import java.util.Scanner;

public class FindLastOccurrence {
    public static int checkLastOccurrence(int[] arr, int element){
        int lastIndex = -1;
        for(int i = arr.length-1; i > 0; i--){
            if(arr[i] == element){
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
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
        System.out.print("Enter the element to check it's last occurrence : ");
        int element = scanner.nextInt();
        System.out.println(element + " last occurred at index " + checkLastOccurrence(arr, element));
    }
}
