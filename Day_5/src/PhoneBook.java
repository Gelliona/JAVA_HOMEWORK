import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNumber);
        } else {
            ArrayList<String> values = new ArrayList<>();
            values.add(phoneNumber);
            phoneBook.put(name, values);
        }
    }

    public ArrayList<String> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return new ArrayList<String>();
    }

    public static HashMap<String, ArrayList<String>> getPhoneBook() {
        return phoneBook;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+79501234567");
        phoneBook.add("Петров", "+79609876541");
        phoneBook.add("Иванов", "+79509876532");
        phoneBook.add("Иванов", "+79501346795");

        System.out.println(PhoneBook.getPhoneBook());
        System.out.println();
        System.out.printf("Иванов=%s\n" , phoneBook.find("Иванов"));
        System.out.printf("Петров=%s\n" , phoneBook.find("Петров"));
        System.out.printf("Сидоров=%s" , phoneBook.find("Сидоров"));
    }
}