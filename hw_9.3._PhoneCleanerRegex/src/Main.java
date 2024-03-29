import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона");
        String inputPhone = new Scanner(System.in).nextLine();
        long clearPhone = PhoneCleanerRegex.PhoneCleanerRegex(inputPhone);
        System.out.println(clearPhone == -1? "Неверный формат номера телефона" : clearPhone);
    }
}
