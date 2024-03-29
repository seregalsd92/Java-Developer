import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона");
        String inputPhoneNum = new Scanner(System.in).nextLine();
        long clearPhoneNum = PhoneCleanerRegex.PhoneCleaner(inputPhoneNum);
        System.out.println(clearPhoneNum == -1? "Неверный формат номера телефона" : clearPhoneNum);
    }
}
