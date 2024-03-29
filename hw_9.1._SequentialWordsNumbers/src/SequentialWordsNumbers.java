public class SequentialWordsNumbers {
    public static String sequentialWordsNumbers (String text) {
        text = text.trim();
        StringBuilder result = new StringBuilder();
        int start = 0;
        int i = 0;

        for (int end = 0; end < text.length(); ) {
            int spacePosition = text.indexOf(" ", start);
            end = spacePosition != -1 ? spacePosition : text.length();
            String partOfText = text.substring(start,end);
            if (!partOfText.isEmpty()) {
                String addingPart = " (".concat(Integer.toString(++i)).concat(") ").concat(partOfText);
                result.append(addingPart);
            }
            start = end + 1;
        }
        return result.toString().trim();
    }
}