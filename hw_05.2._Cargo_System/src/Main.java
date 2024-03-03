public class Main {
    public static void main(String[] args) {
        Cargo cargo2 = new Cargo(500.5, 402.3, 345.3, 1200,
                "Питер, Эрмитаж 1", false, "Номер4499",true);
        System.out.println(cargo2.toString());
        Dimensions dimensions = new Dimensions(20,30,40);
        Cargo cargo3 = new Cargo(dimensions,80,"Москва, Волоколамское шоссе 18",true,"Номер 234",true);
        System.out.println(cargo3.toString());
        Cargo cargo4 = cargo3.setAddress("Нижний новгород");
        Cargo cargo5 = cargo2.setWeight(100);
        System.out.println(cargo5.toString());
        Dimensions dimensions2 = new Dimensions(700,800,900);
        Cargo cargo6 = cargo3.setDimensions(dimensions2);
        cargo5 = cargo2.setDimensions(300,350,400);
        System.out.println(cargo4.toString());
        System.out.println(cargo5.toString());
        System.out.println(cargo6.toString());
        System.out.println(cargo2.toString());
        System.out.println(cargo3.toString());
    }
}
