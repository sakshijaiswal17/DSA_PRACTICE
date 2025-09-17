package recursion.Easy;

import java.util.Scanner;

public class CalcPower {
    /*static int pow(int p, int q){    --> TC : O(q)
        if (q==0) return 1;
        return pow(p,q-1) * p ;
    }*/

    static int pow(int p , int q){
        if (q==0) return 1;
        int smallPow = pow(p,q/2);
        if(q % 2 == 0){
            return smallPow * smallPow;
        }
        return smallPow * smallPow * p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int p = sc.nextInt();
        System.out.print("Enter power : ");
        int q = sc.nextInt();
        System.out.print(p + " raise to the power " + q + " is : ");
        System.out.println(pow(p,q));
    }
}
