package math.Easy;

import java.util.Scanner;

public class CountDigits {
    static int count(int n){
        int count = 0;
        while(n > 0){
            int lastDigit = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(count(n));
    }
}
