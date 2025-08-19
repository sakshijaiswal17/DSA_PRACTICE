package recursion;

import java.util.Scanner;

public class PrintMultiples {

    static void printMultiples(int p, int q){
       if (q<=0) {
           return;
       }
       printMultiples(p,q-1);
       System.out.println(p*q);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int p = sc.nextInt();
        System.out.print("Enter n (Number of multiples you want to print) : ");
        int q = sc.nextInt();
        printMultiples(p,q);
    }
}
