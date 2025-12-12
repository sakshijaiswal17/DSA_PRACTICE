package strings.Easy;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        char[] arr = str.toLowerCase().toCharArray();
        int j = arr.length - 1;
        for (int i = 0; i <= (arr.length / 2); i++) {
            if (arr[i] != arr[j]) {
                System.out.println("Not a palindrome string");
                return;
            }
            j--;
        }
        System.out.println("String is palindrome");
    }
}
