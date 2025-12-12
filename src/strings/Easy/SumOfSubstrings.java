package strings.Easy;

import java.util.Scanner;

public class SumOfSubstrings {
    public static int sumSubstrings(String s) {
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            for(int j = i+1 ; j<s.length()+1 ; j++){
                count += Integer.parseInt(s.substring(i,j));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.nextLine();
        System.out.println("Sum of Substrings: ");
        System.out.println(sumSubstrings(s));
    }
}
