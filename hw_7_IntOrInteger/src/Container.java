public class Container {
    private Integer count;

    public void addCount(int value) {
        count = (count == null) ? value: count + value;
    }

    public Integer getCount() {
        return count;
    }
}
