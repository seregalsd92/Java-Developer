public class Main {
    public static void main(String[] args) {
        char[][] myTable = TwoDimensionalArray.getTwoDimensionalArray(7);
        for (char[] row : myTable) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
