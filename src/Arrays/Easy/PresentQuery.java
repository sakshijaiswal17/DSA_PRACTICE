package Arrays.Easy;

import java.util.Scanner;

public class PresentQuery {

    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];

        for (int j : arr) {
            freq[j]++;
        }

        return freq;
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

        int[] freq = makeFrequencyArray(arr);

        System.out.println("Enter number of queries : ");
        int q = scanner.nextInt();

        while (q > 0){
            System.out.print("Enter number to be searched: ");
            int x = scanner.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            q--;
        }
    }
}
