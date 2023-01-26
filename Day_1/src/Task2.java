/*
Вывести все простые числа от 1 до 1000
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(2);
        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i/2+1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}