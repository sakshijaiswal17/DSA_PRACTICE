package math.Easy;

public class CountDigits {
    static int count(int n){
        int count = 0;
        while(n > 0){
            int lastDigit = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(23));
    }
}
