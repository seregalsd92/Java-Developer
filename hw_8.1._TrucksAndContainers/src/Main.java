import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число ящиков");
        int boxCount = new Scanner(System.in).nextInt();
        Calculator boxCalc = new Calculator(boxCount);
        String result = boxCalc.calculate();
        System.out.println(result);
        System.out.println("\nНеобходимо");
        System.out.println("Контейнеров: " + boxCalc.getContainerCount());
        System.out.println("Грузовиков: " + boxCalc.getTruckCount());
/*        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println("\n");
        for (int j = 1; j <= 3; ++j) {
            System.out.println(j);
        }*/
    }

}
