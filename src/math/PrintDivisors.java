package math;
import java.util.Scanner;

public class PrintDivisors {
    static void printDivisors(int n){
        for (int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Divisors of " + n + " : ");
        printDivisors(n);
    }
}
