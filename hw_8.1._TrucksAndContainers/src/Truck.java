public class Truck {
    public static final int MAX_CONTAINER_COUNT = 12;
    private static int truckCount = 0;

    public Truck() {
        truckCount++;
    }

    public static int getTruckCount() {
        return truckCount;
    }
}
