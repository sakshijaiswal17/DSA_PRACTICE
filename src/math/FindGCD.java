package math;

import java.util.Scanner;

public class FindGCD {
    static void findGCD(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a= a % b;
            }
            else{
                b = b % a;
            }
        }
        if(a==0){
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Greatest common divisor of " + a + " and " + b + " is : ");
        findGCD(a,b);
    }
}
