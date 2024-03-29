public class PhoneCleanerRegex {
    public static long PhoneCleaner (String inputPhoneNum) {
        String regexClear = "[^0-9]";
        String clearPhoneNum = inputPhoneNum.replaceAll(regexClear,"");
        String regexCorrectNum = "[78]\\d{10}";
        if (clearPhoneNum.matches("\\d{10}")) {
            return Long.parseLong("7" + clearPhoneNum);

        } else if (clearPhoneNum.matches(regexCorrectNum)) {
            if (clearPhoneNum.charAt(0) == '8') {
                clearPhoneNum = "7" + clearPhoneNum.substring(1);
            }
            return Long.parseLong(clearPhoneNum);
        } else {
            return -1;
        }
    }
}
