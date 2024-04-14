import java.util.ArrayList;

public class ToDoList {
    private static final ArrayList<String> taskList = new ArrayList<>();

    public static void list() {
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(i + " - " + taskList.get(i));
        }
    }

    public static void add(String task) {
        taskList.add(task);
        System.out.println("Добавлено дело \"" + task +"\"");
    }

    public static void add(int position, String task) {
        if (position >= 0 && position < taskList.size()) {
            taskList.add(position,task);
            System.out.println("Добавлено дело \"" + task +"\" на позиию " + position);
        } else {
            add(task);
        }
    }

    public static void edit(int taskNum, String task) {
        if (taskNum >= 0 && taskNum < taskList.size()) {
            System.out.println("Дело \"" + taskList.get(taskNum) + "\" заменено на \"" + task + "\"");
            taskList.set(taskNum,task);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public static void delete(int taskNum) {
        if (taskNum >= 0 && taskNum < taskList.size()) {
            System.out.println("Дело \"" + taskList.get(taskNum) + "\" удалено");
            taskList.remove(taskNum);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }
}
