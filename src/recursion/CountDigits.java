package recursion;

import java.util.Scanner;

public class CountDigits{
    public static int printCount(int n){
        if (n<=0) return 0;
        return printCount(n/10) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(printCount(n));
    }
}
