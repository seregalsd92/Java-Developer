public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator (int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor () {
        return currentFloor;
    }

    public void moveDown () {
        currentFloor--;
    }

    public void moveUp () {
        currentFloor ++;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Неверно задан этаж");
        } else if (floor < currentFloor) {
            while (currentFloor > floor) {
                moveDown();
                print();
            }
        } else {
            while (currentFloor < floor) {
                moveUp();
                print();
            }
        }
    }

    public void print() {
        System.out.println(currentFloor);
    }
}
