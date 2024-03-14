public class Calculator {
    public static final int MAX_BOX_IN_CONTAINER = 27;
    public static final int MAX_CONTAINER_IN_TRUCK = 12;
    public static final int MAX_BOX_IN_TRUCK = MAX_BOX_IN_CONTAINER * MAX_CONTAINER_IN_TRUCK;
    private final int boxCount;
    private int containerCount = 0;
    private int truckCount = 0;
    private String result = "";

    public Calculator(int boxCount) {
        this.boxCount = boxCount;
    }

    public int getContainerCount() {
        return containerCount;
    }

    public int getTruckCount() {
        return truckCount;
    }

    public String getResult() {
        return result;
    }

    public void calculate() {
        if (boxCount > 0) {
            for (int i = 1; i <= boxCount; i++) {
                if (i % MAX_BOX_IN_TRUCK == 1) {
                    addTruck();
                }
                if (i % MAX_BOX_IN_CONTAINER == 1) {
                    addContainer();
                }
                addBox(i);
            }
        } else {
            result = "Введено не верное количество ящиков";
        }
    }

    public void addTruck () {
        result += System.lineSeparator() + "Грузовик: " + ++truckCount;
    }

    public void addContainer() {
        result += System.lineSeparator() + "\tКонтейнер: " + ++containerCount;
    }

    public void addBox(int boxNumber) {
        result += System.lineSeparator() + "\t\tЯщик: " + boxNumber;
    }

    public void printResult() {
        System.out.println(result);
        System.out.println(System.lineSeparator() + "Необходимо:" + System.lineSeparator());
        System.out.println("грузовиков - " + getTruckCount() + " шт.");
        System.out.println("контейнеров - " + getContainerCount() + " шт.");
    }
}
