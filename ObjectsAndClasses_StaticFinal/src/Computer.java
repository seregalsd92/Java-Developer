public class Computer {
    private Processor processor;
    private RAM ram;
    private HDD hdd;
    private Screen screen;
    private Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer(Processor processor, RAM ram, HDD hdd, Screen screen,
                    Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public  String getName() {
        return name;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public int computerWeight() {
        return processor.getWeight() + ram.getWeight() + hdd.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public String toString() {
        return "Производитель: " + vendor + ", Модель: " + name + "\n" +
                getProcessor().toString() + getRam().toString() + getHdd().toString() +
                getScreen().toString() + getKeyboard().toString();
    }
}
