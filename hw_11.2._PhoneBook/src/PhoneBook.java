import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static final String REGEX_PHONE = "\\d{11}";
    public static final String REGEX_NAME = "[А-Яа-яA-Za-z ]+";
    private TreeMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new TreeMap<>();
    }

    public void phoneHandler (String currentPhoneNumber) {
        boolean existingPhoneNumber = false;
        for (String name : phoneBook.keySet()) {
            if (phoneBook.get(name).contains(currentPhoneNumber)) {
                existingPhoneNumber = true;
                System.out.println(name + " - " + printPhones(phoneBook.get(name)));
                break;
            }
        }
        if (!existingPhoneNumber) {
            String name = "";
            System.out.println("Такого номера нет в телефонной книге.");
            do {
                System.out.println("Введите имя абонента без спецсимволов для номера \"" + currentPhoneNumber + "\":");
                name = new Scanner(System.in).nextLine().trim();
            }
            while (!name.matches(REGEX_NAME));
            createOrUpdateContact(name,currentPhoneNumber);
        }
    }

    public void nameHandler (String currentName) {
        if (phoneBook.containsKey(currentName)) {
            System.out.println(currentName + " - " + printPhones(phoneBook.get(currentName)));
        } else {
            String phoneNumber = "";
            System.out.println("Такого имени в телефонной книге нет.");
            do {
                System.out.println("Введите номер телефона в формате 79161234567 для абонента \"" + currentName + "\":");
                phoneNumber = new Scanner(System.in).nextLine().trim();
            }
            while (!phoneNumber.matches(REGEX_PHONE));
            createOrUpdateContact(currentName,phoneNumber);
        }
    }

    public void list () {
        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey().concat(" - ").concat(printPhones(entry.getValue())));
        }
    }

    private void createOrUpdateContact (String name, String phone) {
        ArrayList<String> personPhoneNumbers = phoneBook.get(name) == null ? new ArrayList<>() : phoneBook.get(name);
        personPhoneNumbers.add(phone);
        phoneBook.put(name,personPhoneNumbers);
        System.out.println("Контакт сохранен!");
    }

    private String printPhones(ArrayList<String> phones) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < phones.size(); i++) {
            result.append(phones.get(i));
            if (i != phones.size() - 1) {
                result.append(", ");
            }

        }
        return result.toString();
    }
}
