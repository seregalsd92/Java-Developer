import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите -1 для выхода. Введите номер телефона, имя или команду:");
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            String input = new Scanner(System.in).nextLine().trim();
            if (input.equals("-1")) {
                break;
            }
            if (input.equals("LIST")) {
                phoneBook.list();
            } else if (input.matches(PhoneBook.REGEX_NAME)) {
                phoneBook.nameHandler(input);
            } else if (input.matches(PhoneBook.REGEX_PHONE)) {
                phoneBook.phoneHandler(input);
            } else {
                System.out.println("Не верный ввод");
            }
        }
    }
}
