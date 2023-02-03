import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> MyList = new ArrayList<>(30);
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            MyList.add(random.nextInt(10, 20));
        }

        System.out.println(MyList);
        ArrayList<Integer> NewList = new ArrayList<>();

        for (int i = 0; i < MyList.size()-1; i++) {
            if (MyList.get(i) % 2 != 0) {
                NewList.add(MyList.get(i));
            }
        }
        System.out.print(NewList);
    }
}
