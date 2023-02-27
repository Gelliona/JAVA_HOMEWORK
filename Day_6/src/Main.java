import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;



public class Main {

    /**
     * Этот метод выводит всю базу ноутбуков
     * @param laptops множество ноутбуков
     */
    public  static void printAll(HashSet<Laptop> laptops){
        int count = 0;
        for (Laptop lap : laptops){
            count++;
            System.out.printf("%d. ", count);
            System.out.println(lap);
            System.out.println();
        }
    }


    public static void menu(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.println("--------------------------------");
        System.out.println("Добро пожаловать в каталог ноутбуков!");
        System.out.println("Выберите действие: ");
        System.out.println("1 - Печать всех товаров\n2 - Поиск по каталогу\n0 - Выход");
        System.out.println("--------------------------------");
        System.out.print("Введите команду: ");
        int input = iScanner.nextInt();

        switch (input) {
            case 1 -> {
                printAll(laptops);
                subMenu1(iScanner, laptops);
            }
            case 2 -> filter(iScanner, laptops);
            case 0 -> {
                System.out.println("До свидания!");
                iScanner.close();
            }
            default -> {
                System.out.println("Ошибка ввода!");
                menu(iScanner, laptops);
            }
        }
    }

    public static void subMenu1(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.println("--------------------------------");
        System.out.println("Выберите следующее действие: ");
        System.out.println("1 - Вернуться в главное меню\n0 - Выход");
        System.out.println("--------------------------------");
        System.out.print("Введите команду: ");
        int input = iScanner.nextInt();

        switch (input) {
            case 1 -> menu(iScanner, laptops);
            case 0 -> {
                System.out.println("До свидания!");
                iScanner.close();
            }
            default -> {
                System.out.println("Ошибка ввода!");
                menu(iScanner, laptops);
            }
        }
    }

    public static void filter(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.println("--------------------------------");
        System.out.println("Выберите критерий поиска: ");
        System.out.println("""
                1 - По производителю
                2 - По размеру экрана
                3 - По типу матрицы
                4 - По объёму оперативной памяти
                5 - По объёму жёсткого диска
                6 - По оперативной системе
                7 - По цвету
                8 - По цене
                9 - Возврат в главное меню
                0 - Выход""");
        System.out.println("--------------------------------");
        System.out.print("Введите команду: ");
        int input = iScanner.nextInt();
        switch (input) {
            case 1 -> {
                findByManufact(iScanner, laptops);
                subMenu1(iScanner, laptops);
            }
            case 2 -> {
                findByScreen(iScanner, laptops);
                subMenu1(iScanner, laptops);
            }
            case 3 -> {
                findByMatrix(iScanner, laptops);
                subMenu1(iScanner, laptops);
            }
            case 4 -> {
                findByRam(iScanner, laptops);
                subMenu1(iScanner, laptops);
            }
            case 5 -> {
                findByHD(iScanner, laptops);
                subMenu1(iScanner, laptops);
            }
            case 6 -> {
                findBySystem(iScanner, laptops);
                subMenu1(iScanner, laptops);
            }
            case 7 -> {
                findByColor(iScanner, laptops);
                subMenu1(iScanner, laptops);
            }
            case 8 -> {
                findByPrice(iScanner, laptops);
                subMenu1(iScanner, laptops);
            }
            case 9 -> menu(iScanner, laptops);
            case 0 -> System.out.println("До свидания!");
            default -> {
                System.out.println("Ошибка ввода!");
                menu(iScanner, laptops);
            }
        }
    }

    public static void findByManufact(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.print("Введите производителя (ASUS, Lenovo, Apple, Huawei): ");
        String input = iScanner.next();
        int count = 0;
        System.out.println("--------------------------------");
        System.out.printf("Найдено по Вашему запросу (производитель - %s):\n", input);
        System.out.println();

        for (Laptop lap : laptops){
            if (lap.manufacturer.equals(input)) {
                count++;
                System.out.printf("%d. ", count);
                System.out.println(lap);
                System.out.println();
            }
        }
    }

    public static void findByScreen(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.print("Введите минимальный размер экрана в дюймах: ");
        int inputMin = iScanner.nextInt();
        System.out.print("Введите максимальный размер экрана в дюймах: ");
        int inputMax = iScanner.nextInt();
        int count = 0;
        System.out.println("--------------------------------");
        System.out.printf("Найдено по Вашему запросу (размер экрана от %s\" до %s\"):\n", inputMin, inputMax);
        System.out.println();

        for (Laptop lap : laptops){
            if (lap.screenSize >= inputMin && lap.screenSize <= inputMax) {
                count++;
                System.out.printf("%d. ", count);
                System.out.println(lap);
                System.out.println();
            }
        }
    }
    public static void findByMatrix(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.print("Введите тип матрицы (IPS, TN): ");
        String input = iScanner.next();
        int count = 0;
        System.out.println("--------------------------------");
        System.out.printf("Найдено по Вашему запросу (тип матрицы - %s):\n", input);
        System.out.println();

        for (Laptop lap : laptops){
            if (lap.matrixType.equals(input)) {
                count++;
                System.out.printf("%d. ", count);
                System.out.println(lap);
                System.out.println();
            }
        }
    }

    public static void findByRam(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.print("Введите объём операционной системы, ГБ (4, 8, 16): ");
        int input = iScanner.nextInt();
        int count = 0;
        System.out.println("--------------------------------");
        System.out.printf("Найдено по Вашему запросу (объём операционной системы - %dГБ):\n", input);
        System.out.println();

        for (Laptop lap : laptops){
            if (lap.ramVolume == input) {
                count++;
                System.out.printf("%d. ", count);
                System.out.println(lap);
                System.out.println();
            }
        }
    }

    public static void findByHD(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.print("Введите объём жёсткого диска, ГБ (256, 512): ");
        int input = iScanner.nextInt();
        int count = 0;
        System.out.println("--------------------------------");
        System.out.printf("Найдено по Вашему запросу (объём жёсткого диска - %dГБ):\n", input);
        System.out.println();

        for (Laptop lap : laptops){
            if (lap.hdVolume == input) {
                count++;
                System.out.printf("%d. ", count);
                System.out.println(lap);
                System.out.println();
            }
        }
    }

    public static void findBySystem(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.print("Введите тип операционной системы (Windows10, Windows11, MacOS, none): ");
        String input = iScanner.next();
        int count = 0;
        System.out.println("--------------------------------");
        System.out.printf("Найдено по Вашему запросу (операционная система - %s):\n", input);
        System.out.println();

        for (Laptop lap : laptops){
            if (lap.operSystem.equals(input)) {
                count++;
                System.out.printf("%d. ", count);
                System.out.println(lap);
                System.out.println();
            }
        }
    }

    public static void findByColor(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.print("Введите цвет (silver, grey, black): ");
        String input = iScanner.next();
        int count = 0;
        System.out.println("--------------------------------");
        System.out.printf("Найдено по Вашему запросу (цвет - %s):\n", input);
        System.out.println();

        for (Laptop lap : laptops){
            if (lap.color.equals(input)) {
                count++;
                System.out.printf("%d. ", count);
                System.out.println(lap);
                System.out.println();
            }
        }
    }

    public static void findByPrice(Scanner iScanner, HashSet<Laptop> laptops){
        System.out.print("Введите минимальную цену: ");
        int inputMin = iScanner.nextInt();
        System.out.print("Введите максимальную цену: ");
        int inputMax = iScanner.nextInt();
        int count = 0;
        System.out.println("--------------------------------");
        System.out.printf("Найдено по Вашему запросу (цена от %d до %d):\n", inputMin, inputMax);
        System.out.println();

        for (Laptop lap : laptops){
            if (lap.price >= inputMin && lap.price <= inputMax) {
                count++;
                System.out.printf("%d. ", count);
                System.out.println(lap);
                System.out.println();
            }
        }
    }



    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new FileReader("src/catalog.txt"));
        String str;
        HashSet<Laptop> laptops = new HashSet<>();
        while ((str = br.readLine()) != null){
            String[] newStr = str.split(", ");
            Laptop newLaptop = new Laptop(Integer.parseInt(newStr[0]), newStr[1], newStr[2], Double.parseDouble(newStr[3]),
                                       newStr[4], Integer.parseInt(newStr[5]), Integer.parseInt(newStr[6]), newStr[7],
                                       newStr[8], Integer.parseInt(newStr[9]));
            laptops.add(newLaptop);
        }
        br.close();

        Scanner iScanner = new Scanner(System.in);
        menu(iScanner, laptops);
        iScanner.close();

    }
}
