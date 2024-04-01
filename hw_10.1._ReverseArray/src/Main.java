public class Main {
    public static void main(String[] args) {
        String[] arrayToSort = {"a", "b","c","d"};
        String[] sortedArray = ReverseArray.reverse(arrayToSort);
        for (String res : sortedArray) {
            System.out.println(res);
        }
    }
}
