import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите команду. Введите -1 для выхода");
        while (true) {
            String input = new Scanner(System.in).nextLine();
            if (input.equals("-1")) {
                break;
            }
            String [] arguments = input.trim().split("\\s+");
            String email = "";
            int i = 1;
            while (i < arguments.length) {
                email = email.concat(arguments[i]);
                i++;
            }
            email = email.trim();
            switch (arguments[0]) {
                case "LIST" -> EmailList.list();
                case "ADD" -> EmailList.add(email);
                default -> System.out.println("Не верный ввод");
            }
        }
    }
}
