/*
Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
 */

import java.util.Scanner;

public class Task1 {
    static void Sum(int n) {
        int summa = (n * (n + 1))/2;
        System.out.printf("Сумма чисел от 1 до %s = %s\n", n, summa);
    }
    static void Factorial(int n) {
        int i = 2;
        int total = 1;
        while (i <= n) {
            total = total * i;
            i++;
        }
        System.out.printf("Факториал числа %s = %s\n", n, total);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        String input = iScanner.nextLine();
        int n = Integer.parseInt(input);
        Sum(n);
        Factorial(n);
        iScanner.close();
    }
}
