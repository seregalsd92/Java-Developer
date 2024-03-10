public class RAM {
    private final String type;
    private final int volume; // mb
    private final int weight; // gramm

    public RAM(String type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Оперативная память " + getType() +
                ", объем " + getVolume() +
                ", вес: " + getWeight() + "\n";
    }
}
