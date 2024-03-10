public class Processor {
    private final int frequency;
    private final int coreCount;
    private final String producer;
    private final int weight; // gramm

    public Processor(int frequency, int coreCount, String producer, int weight) {
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.producer = producer;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public String getProducer() {
        return producer;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Процессор " + getProducer() +
                ", количество ядер " + getCoreCount() +
                ", частота " + getFrequency() +
                ", вес: " + getWeight() + "\n";
    }
}
