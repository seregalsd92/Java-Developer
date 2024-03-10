public class Keyboard {
    private final String type;
    private final boolean hasBacklight;
    private final int weight; //gramm

    public Keyboard (String type, boolean hasBacklight, int weight) {
        this.type = type;
        this.hasBacklight = hasBacklight;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean getHasBacklight() {
        return hasBacklight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Клавиатура: " + getType() +
                ", подсветка: " + getHasBacklight() +
                ", вес: " + getWeight() + "\n";
    }
}
