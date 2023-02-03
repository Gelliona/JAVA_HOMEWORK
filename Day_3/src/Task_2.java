import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> MyList = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            MyList.add(random.nextInt(1, 10));
        }

        System.out.println(MyList);

        double sum = MyList.stream().mapToInt(a -> a).sum();

        System.out.printf("Минимальное значение списка - %s\n",Collections.min(MyList));
        System.out.printf("Мaксимальное значение списка - %s\n",Collections.max(MyList));
        System.out.printf("Cреднее значение списка - %s",sum/10);


    }
}