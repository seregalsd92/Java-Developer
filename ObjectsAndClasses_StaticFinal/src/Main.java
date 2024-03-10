public class Main {
    public static void main(String[] args) {
        Processor processor1 = new Processor(2400, 2, "AMD", 25);
        RAM ram1 = new RAM("DDDR2", 1333, 200);
        HDD hdd1 = new HDD(HDDType.HDD, 512, 1000);
        Screen screen1 = new Screen(15.7, ScreenType.TN, 5000);
        Keyboard keyboard1 = new Keyboard("A4tech", true, 830);
        Processor processor2 = new Processor(3600, 8, "Intel", 32);
        RAM ram2 = new RAM("DDDR5", 2133, 250);
        HDD hdd2 = new HDD(HDDType.SSD, 1024, 1050);
        Screen screen2 = new Screen(17.7, ScreenType.IPS, 6200);
        Keyboard keyboard2 = new Keyboard("Razer", true, 600);
        Computer HP1262 = new Computer(processor1, ram1, hdd1, screen1, keyboard1,
                "HP", "Model 1262");
        Computer ASUS366 = new Computer(processor2, ram2, hdd2, screen2, keyboard2,
                "ASUS", "Model i7 366");
        Computer HP1262_2 = new Computer(processor1, ram1, hdd1, screen1, keyboard1,
                "HP", "Model 1262");
        System.out.println("Вес компа 1: " + HP1262.computerWeight());
        System.out.println("Вес компа 2: " + ASUS366.computerWeight());
        System.out.println("Вес компа 3: " + HP1262_2.computerWeight());
        System.out.println(HP1262.toString());
        System.out.println(ASUS366.toString());
        System.out.println(HP1262_2.toString());
        System.out.println(HP1262_2.getRam().toString() + HP1262_2.getHdd().toString());
        HP1262_2.setRam(ram2);
        HP1262_2.setHdd(hdd2);
        System.out.println(HP1262_2.getRam().toString() + HP1262_2.getHdd().toString());
        System.out.println("Вес компа 1: " + HP1262.computerWeight());
        System.out.println("Вес компа 2: " + ASUS366.computerWeight());
        System.out.println("Вес компа 3: " + HP1262_2.computerWeight());
        System.out.println(HP1262.toString());
        System.out.println(ASUS366.toString());
        System.out.println(HP1262_2.toString());
    }
}
