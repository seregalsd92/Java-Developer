public class PhoneCleanerRegex {
    public static long PhoneCleanerRegex (String inputPhoneNum) {
        String regexClear = "[^0-9]";
        String clearPhoneNum = inputPhoneNum.replaceAll(regexClear,"");
        String regexCorrectNum = "[78]\\d{10}";
        if (clearPhoneNum.matches("\\d{10}")) {
            return Long.parseLong("7" + clearPhoneNum);

        } else if (clearPhoneNum.matches(regexCorrectNum)) {
            if (clearPhoneNum.charAt(0) == 8) {
                clearPhoneNum = "7" + clearPhoneNum.substring(1);
            }
            return Long.parseLong(clearPhoneNum);
        } else {
            return -1;
        }
        // цифр 10 или 11
        // Если цифр 10 - добавить первой цифрой 7
        // первая цифа 7 или 8
        // Если первая цифра 8 - заменить на 7
    }
}
