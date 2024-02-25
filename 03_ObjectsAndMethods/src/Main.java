public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко", 60, 5, 0.9);
        basket.add("Колбаса",300,2,1.5);
        basket.add("Ручка", 50);
        basket.add("Пакет",5,3);
        basket.print("Содержимое корзины");
        System.out.println("Итоговая цена: " + basket.getTotalPrice());
        System.out.println("Итоговый вес: " + basket.getTotalWeight());
        basket.clear();
        basket.print("После очистки");
    }
}
