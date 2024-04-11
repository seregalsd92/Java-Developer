public class TwoDimensionalArray {
    public static char[][] getTwoDimensionalArray(int size) {
        char[][] resultArray = new char[size][size];
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                resultArray[i][j] = (i == j || i == size-1-j) ? 'X' : ' ';
            }
        }
        return resultArray;
    }
}
