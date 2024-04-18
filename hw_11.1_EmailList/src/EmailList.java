import java.util.TreeSet;

public class EmailList {
    private static final TreeSet<String> emailList = new TreeSet<>();

    public static TreeSet<String> getSortedList () {
        return emailList;
    }

    public static void add (String email) {
        if (checkEmailValid(email)) {
            emailList.add(email);
        }
    }

    public static void list() {
        for (String email : getSortedList()) {
            System.out.println(email);
        }
    }

    private static boolean checkEmailValid (String email) {
        String regex = "\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z";
        return email.matches(regex);
    }
}
