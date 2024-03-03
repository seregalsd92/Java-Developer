public class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean rotationable;
    private final String regNumber;
    private final boolean fragile;

    public Cargo (Dimensions dimensions,double weight, String address,
                  boolean rotationable, String regNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.rotationable = rotationable;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public Cargo (double width, double length, double height, double weight, String address,
                  boolean rotationable, String regNumber, boolean fragile) {
        this.dimensions = new Dimensions(width,length,height);
        this.weight = weight;
        this.address = address;
        this.rotationable = rotationable;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, rotationable, regNumber, fragile);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, address, rotationable, regNumber, fragile);
    }

    public Cargo setDimensions (Dimensions dimensions) {
        return new Cargo(dimensions, weight, address, rotationable, regNumber, fragile);
    }

    public Cargo setDimensions (double width, double length, double height) {
        return new Cargo(width, length, height, weight, address, rotationable, regNumber, fragile);
    }

    public String toString() {
        return "\nШирина: " + dimensions.getWidth() +
                "\nДлина: " + dimensions.getLength() +
                "\nВысота: " + dimensions.getHeight() +
                "\nОбъем: " + dimensions.volume() +
                "\nВес: " + weight +
                "\nАдрес: " + address +
                "\nМожно переворачивать: " + rotationable +
                "\nРегистрационный номер: " + regNumber +
                "\nХрупкость: " + fragile;
    }
}