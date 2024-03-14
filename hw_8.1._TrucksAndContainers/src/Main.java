import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число ящиков");
        int boxCount = new Scanner(System.in).nextInt();
        Calculator boxCalc = new Calculator(boxCount);
        boxCalc.calculate();
        boxCalc.printResult();
    }

}
