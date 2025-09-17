package recursion.Easy;

import java.util.Scanner;

public class SumOfDigits {
    public static int printSum(int n){
        if (n>=0 && n<9) return n;
        return printSum(n/10) + n%10 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(printSum(n));
    }
}
