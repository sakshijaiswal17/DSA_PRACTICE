package recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void print(int n){
        if(n==1){
            System.out.print("1 ");
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        print(n);
    }
}
