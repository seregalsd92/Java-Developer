public class Boxes {
    private int boxCount;
    private int boxNumInContainer;

    public Boxes (int boxCount) {
        this.boxCount = boxCount;
    }

    public void addBoxes() {
        Container container = new Container();
        Truck truck = new Truck();
        for (int i = 1; i <= boxCount; i++) {
            boxNumInContainer++;
            if (boxNumInContainer > Container.MAX_BOX_COUNT) {
                new Container();
                if (Container.getContainerCount() > Truck.MAX_CONTAINER_COUNT) {
                    new Truck();
                }

        }

        }
    }
}
