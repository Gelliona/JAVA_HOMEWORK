import java.util.*;
import java.lang.*;

class CountedNames {
    String name;
    int num;

    public CountedNames(String name, int num) {
        this.name = name;
        this.num = num;
    }
    public String toString() {
        return this.name + " " + this.num;
    }

    public static class Sortbyname implements Comparator<CountedNames> {
        public int compare(CountedNames a, CountedNames b) {
            return b.num - a.num;
        }
    }
}

public class Task2 {
    public static void main(String[] args) {

        String inputList = "Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, " +
                "Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Иван Савин, Мария Рыкова, " +
                "Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] nameArray = inputList.split(", ");   //Формируем массив строк, разделенных пробелом.

        ArrayList<String> temp = new ArrayList<>();        //Формируем список только имён.
        for (String s : nameArray) {
            String[] fullName = s.split(" ");
            temp.add(fullName[0]);
        }

        ArrayList<CountedNames> people = new ArrayList<CountedNames>(); //Создаём список из экземпляров класса
                                                                        // CountedNames, которые содержат повторяющиеся
        for (String item : temp) {                                      // имена и количество их повторений.
            int count = Collections.frequency(temp, item);
            if (count>1){
                people.add(new CountedNames(item, count));
            }
        }

        people.sort(new CountedNames.Sortbyname());             //Сортируем список по уменьшению повторяемости имён.

        LinkedHashSet<String> setName = new LinkedHashSet<>();  //Создаём множество и переносим в него элементы
                                                                //предыдущего списка, чтобы убрать повторяющиеся имена.
        for (CountedNames item : people) {
            String names = item.toString();
            setName.add(names);
        }
        for (String item : setName){
            System.out.println(item);
        }
    }
}
