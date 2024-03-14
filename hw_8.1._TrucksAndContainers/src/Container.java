public class Container {
    public static final int MAX_BOX_COUNT = 27;
    private static int containerCount = 0;
//    private static int boxNumInContainer = 0;

    public Container () {
        containerCount++;
    }

    public static int getContainerCount() {
        return containerCount;
    }

    /*public void addBox() {
        boxNumInContainer++;
        if (boxNumInContainer > MAX_BOX_COUNT) {
            Container container = new Container();
            if (containerCount > Truck.MAX_CONTAINER_COUNT) {
                Truck truck = new Truck();
            }
        }
    }*/
}
