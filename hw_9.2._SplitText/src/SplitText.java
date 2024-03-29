public class SplitText {
    public static String splitText (String text) {
        String regex = "[^a-zA-Z\\s\\-]";
        String cleanText = text.replaceAll(regex,"");
        String [] words = cleanText.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]).append("\n");
        }
        return result.toString();
    }

}