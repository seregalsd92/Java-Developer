import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Birthdays {

    public static String collectBirthdays(int year, int month, int day) {
        StringBuilder result = new StringBuilder();
        if (year > 0 && month > 0 && month <= 12 && day > 0 && day <= 31) {
            LocalDate now = LocalDate.now();
            LocalDate birthday = LocalDate.of(year, month, day);
            long currentAge = birthday.until(now, ChronoUnit.YEARS);
            for (int age = 0; age <= currentAge; age++) {
                result.append(birthdayInYear(birthday.plusYears(age), age));
            }
        } else {
            result.append("Не верно введена дата");
        }
        return result.toString();
    }

    private static String birthdayInYear(LocalDate birthday, int age) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(age + " - dd.MM.yyyy - E\n");
        return formatter.format(birthday);
    }
}