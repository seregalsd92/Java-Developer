public class Arithmetic {
    private int x;
    private int y;

    public Arithmetic (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum () {
        return x + y;
    }

    public int multiplication() {
        return x * y;
    }

    public int max () {
        return x > y ? x : y;
    }

    public int min () {
        return x < y ? x : y;
    }

}
