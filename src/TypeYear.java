import java.util.Scanner;

public class TypeYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scan.nextInt();
        int a = year % 4;
        int b = year % 100;
        int c = year % 400;

        if (a == 0 && b != 0 || c == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Обычный год");
        }
    }
}
