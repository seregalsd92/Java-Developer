public class Main {
    public static final String RUSSIAN_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        System.out.println("_______________");
        System.out.println(getCharNumbers(RUSSIAN_ALPHABET));
    }

    private static String getCharNumbers(String inputString) {
        String outputNumbers = "";
        for (int i = 0; i < 65536; i++) {
            char symbol_i = (char) i;
            for (int j = 0; j < inputString.length(); j++) {
                char symbol_j = inputString.charAt(j);
                if (symbol_i == symbol_j) {
                    outputNumbers = outputNumbers + i + " - " + symbol_i + "\n";
                }
            }
        }
        return outputNumbers;
    }
}
