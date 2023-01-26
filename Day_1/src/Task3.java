/*
Реализовать простой калькулятор (операции + - / * )
 */

import java.util.Scanner;

public class Task3 {
    static void Summa(double a, double b) {
        System.out.println (a + b);
    }
    static void Difference(double a, double b) {
        System.out.println (a - b);
    }

    static void Product(double a, double b) {
        System.out.println (a * b);
    }
    static void Quotient(double a, double b) {
        if (b == 0) {
            System.out.println("На 0 делить нельзя!");
        } else {
            double total = a / b;
            System.out.println(total);
        }
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        String inputA = iScanner.nextLine();
        double a = Double.parseDouble(inputA);

        System.out.print("Введите число 2: ");
        String inputB = iScanner.nextLine();
        double b = Double.parseDouble(inputB);

        System.out.print("Введите операцию (+, -, *, /): ");
        String oper = iScanner.nextLine();

        switch (oper) {
            case "+":
                Summa(a, b);
                break;
            case "-":
                Difference(a, b);
                break;
            case "*":
                Product(a, b);
                break;
            case "/":
                Quotient(a, b);
                break;
            default:
                System.out.println("Неизвестная операция!");
                break;
        }
        iScanner.close();
    }
}