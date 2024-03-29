import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Замена фрагментов через регулярные выражения");
        String phone1 = "+7 903 712-37-54";
        String phone2 = "7 (903) 968-60-45";
        String phone3 = "7999-666-66-66";
        String phone4 = "7(903)9616245";
        System.out.println(formatPhoneNumber(phone1));
        System.out.println(formatPhoneNumber(phone2));
        System.out.println(formatPhoneNumber(phone3));
        System.out.println(formatPhoneNumber(phone4));

        System.out.println("\nРазбиение строк на фрагменты");
        String text2 = "I  know\tsomething   about\n  it";
        String[] words = text2.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("\nПроверка соответствия строк шаблону");
        String number = "А674МР197";
        String lettersRange = "[АВЕКМНОРСТУХ]";
        String regex3 = lettersRange + "[0-9]{3}" + lettersRange + "{2}[0-9]{2,3}";
        System.out.println(number.matches(regex3));

        System.out.println("\nПоиск фрагментов строк, соответствующих шаблону");
        String text4 = "Алексей, добрый день!\nМой гитхаб — https://github.com/, а также ссылка на мой персональный сайт — https://www.skillbox.ru/\nЕсли возникнут вопросы, пишите мне напрямую. Я всегда доступен";
        String regex4 = "https://[^,\\s]+";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(text4);
        while (matcher4.find()) {
           /* int start = matcher4.start();
            int end = matcher4.end();
            System.out.println(text4.substring(start, end));*/
            System.out.println(matcher4.group());
        }

        System.out.println("\nМаски в регулярных выражениях");
        String text5 = "Дмитрий сообщил следующее: «Я вернусь в 12:40 и, будьте добры, подготовьте к этому времени все документы!» На что Анна ему ответила: " +
                "«А документы-то так и не привезли». Дмитрий удивлённо посмотрел на неё и сказал: «Ну и ладно», — вздохнул, махнул рукой и удалился.";
        String regex5 = "«([^»]+)»";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(text5);
        while (matcher5.find()) {
            String citation = matcher5.group(1);
            System.out.println(citation);
        }

        String text = "A23E-8M28-76AF-2L65-24A3";
        String regex = "[A-F0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        matcher.find();
        matcher.find();
        System.out.println(matcher.group());
    }

    public static String formatPhoneNumber(String phone) {
        String regex = "[^0-9]";
        return phone.replaceAll(regex, "");
    }
}
