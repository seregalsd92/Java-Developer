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
//        basket.clear();
//        basket.print("После очистки");

        System.out.println("\n______________");
        Basket basket1 = new Basket("Товары",500);
        basket1.print("Содержимое корзины 1");
        System.out.println("Итоговая цена: " + basket1.getTotalPrice());
        System.out.println("Итоговый вес: " + basket1.getTotalWeight());
        System.out.println("Лимит корзины: " + basket1.getLimit());

        System.out.println("Средняя цена товара: " + Basket.averageProductPrice());
        System.out.println("Средняя стоимость корзины: " + Basket.averageBasketPrice());
    }
}
