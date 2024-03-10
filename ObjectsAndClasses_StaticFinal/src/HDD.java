public class HDD {
    private final HDDType type;
    private final int volume; // gb
    private final int weight; // gramm

    public HDD(HDDType type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public HDDType getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Жесткий диск " + getType() +
                ", объем " + getVolume() +
                ", вес: " + getWeight() + "\n";
    }
}
