import java.util.Scanner;
public class romanNumerals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number 1-999 and we'll convert it to Roman numerals.");
        int n = in.nextInt();
        String ones = romanDigit(n%10,"I","V","X");
        n/=10;
        String tens = romanDigit(n%10,"X","L","C");
        n/=10;
        String hundreds = romanDigit(n%10,"C","D","M");
        System.out.println(hundreds + tens + ones);
    }
    public static String romanDigit(int n, String one, String five, String ten) {
        String y = "";
        if ((n >= 5) && (n < 9)) {
            y = y + five;
            for (int i = 0; i < n % 5; i++) {
                y = y + one;
            }
        }
        else if (n < 4 && n != 0) {
            for (int i = 0; i < n; i++) {
                y = y + one;
            }
        }
        else if (n==9) {
            y = one + ten;
        }
        else if (n==4) {
            y = one + five;
        }
        return y;
    }
}