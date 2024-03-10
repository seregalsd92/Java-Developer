public class Screen {
    private final double diagonal; // inch
    private final ScreenType type;
    private final int weight; //gramm

    public Screen(double diagonal, ScreenType type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public ScreenType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Экран " + getType() +
                ", диагональ " + getDiagonal() +
                ", вес: " + getWeight() + "\n";
    }
}
