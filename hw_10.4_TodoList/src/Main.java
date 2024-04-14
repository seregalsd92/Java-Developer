import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите команду. Введите -1 для выхода");
        while (true) {
            String input = new Scanner(System.in).nextLine();
            if (input.equals("-1")) {
                break;
            }
            String [] arguments = input.trim().split("\\s+");
            int position = -1;
            String task = "";
            int i = 1;
            if (arguments.length > 1 && arguments[1].matches("\\d+")) {
                position = Integer.parseInt(arguments[1]);
                i = 2;
            }
            for (; i < arguments.length; i++) {
                task = task.concat(arguments[i]).concat(" ");
            }
            task = task.trim();
            switch (arguments[0]) {
                case "LIST" -> ToDoList.list();
                case "ADD" -> {
                    if (position == -1) {
                        ToDoList.add(task);
                    } else {
                        ToDoList.add(position, task);
                    }
                }
                case "EDIT" -> ToDoList.edit(position,task);
                case "DELETE" -> ToDoList.delete(position);
                default -> System.out.println("Не верный ввод");
            }
        }
    }
}
