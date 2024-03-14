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

    public String calculate() {
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
        return result;
    }

    public void addTruck () {
//        truckCount++;
        result += "\nГрузовик: " + ++truckCount;
//       return result;
    }

    public void addContainer() {
//        containerCount++;
        result += "\n\tКонтейнер: " + ++containerCount;
//        return result;
    }

    public void addBox(int boxNumber) {
        result += "\n\t\tЯщик: " + boxNumber;
    }
}
