package strings.Easy;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'p', 'r', 'i', 'y', 'a'};
        for(char element : arr){
            System.out.print(element + " ");
        }

        String name = sc.next();
        System.out.println(name);
        String t = sc.nextLine();
        System.out.println(t);

        
    }
}
