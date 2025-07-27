package math;

import java.util.Scanner;

public class CheckPalindrome {
    static int reverse(int n){
        int reverseNum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n / 10;
        }
        return reverseNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int x = reverse(n);
        if (x==n){
            System.out.println("Yes " + n + " is a palindrome");
        }
        else{
            System.out.println("No " + n + " is not a palindrome");
        }
    }
}
