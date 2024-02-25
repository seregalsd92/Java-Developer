public class Main {
    public static void main(String[] args) {
        Arithmetic first = new Arithmetic(12,4);

        System.out.println("Сумма = " + first.sum());
        System.out.println("Произведение = " + first.multiplication());
        System.out.println("Большее = " + first.max());
        System.out.println("Меньшее = " + first.min());
    }
}
