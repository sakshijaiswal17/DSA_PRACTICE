package strings.Easy;

import java.util.Scanner;

public class NumberOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        char[] arr = s.toLowerCase().toCharArray();
        for(char c : arr){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
