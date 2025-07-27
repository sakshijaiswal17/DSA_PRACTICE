package math;

import java.util.Scanner;

public class CheckArmstrong {
    static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
}
