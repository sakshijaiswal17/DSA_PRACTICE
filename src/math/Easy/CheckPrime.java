package math.Easy;

import java.util.Scanner;

public class CheckPrime {
    static boolean isPrime(int n){
        int count =0;
        for(int i = 1; i * i <= n ; i++){
            if(n % i ==0){
                count++;
                if(n / i != i){
                    count++;
                }
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("");
        System.out.println(isPrime(n));
    }
}
