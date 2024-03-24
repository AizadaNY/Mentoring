package programtasks.todolist;

import programtasks.CommonMethods;

import java.text.ParseException;

public class UserOptions {

    private final int ADD_TASK = 1;
    private final int DELETE_TASK = 2;
    private final int VIEW_ALL_TASKS = 3;
    private final int EXIT = 0;

    public static boolean addMore = true;

    public void selectOption(int option) throws ParseException {

        TaskList taskList = new TaskList();
        ViewTasks viewTasks = new ViewTasks();

        if (option == ADD_TASK) {
            taskList.addTask(CommonMethods.getUserInput("Task Name: "),
                    CommonMethods.getUserInput("Task complete time: "),
                    CommonMethods.getUserInput("Task description: "),
            CommonMethods.getUserInput("Enter date: "));
        } else if (option == DELETE_TASK) {
            taskList.deleteTask(CommonMethods.getUserInput("Task number: "));
        } else if (option == VIEW_ALL_TASKS) {
            viewTasks.printTasks();
        } else if (option == EXIT) {
            addMore = false;
        }
    }
}
