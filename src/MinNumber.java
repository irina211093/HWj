import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = scan.nextInt();
        System.out.print("Input second number: ");
        int b = scan.nextInt();
        System.out.print("Input third number: ");
        int c = scan.nextInt();

        if (a < b && a < c) {
            System.out.println("Min number is " + a);
        } else if (b < a && b < c) {
            System.out.println("Min number is " + b);
        } else {
            System.out.println("Min number is " + c);
        }
    }
}
