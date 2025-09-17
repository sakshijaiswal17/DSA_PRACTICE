package recursion.Easy;

import java.util.Scanner;

public class SeriesSum {
    static int printSeries(int n){
        if(n==0){
            return 0;
        }
        if(n % 2 == 0){
            return printSeries(n-1) - n ;
        } else{
            return printSeries(n-1) + n ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(printSeries(n));
    }
}
