public class ReverseArray {
    public static String[] reverse(String[] input) {
        String[] result = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            result[result.length - 1 - i] = input[i];
        }
        return result;
    }
}