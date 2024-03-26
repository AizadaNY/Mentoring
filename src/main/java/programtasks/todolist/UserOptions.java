package programtasks.todolist;

import programtasks.CommonMethods;

import java.text.ParseException;

public class UserOptions {

    private final String ADD_TASK = "1";
    private final String DELETE_TASK = "2";
    private final String VIEW_ALL_TASKS = "3";
    private final String EXIT = "0";

    public static boolean addMore = true;

    public void selectOption(String option) throws ParseException {

        TaskList taskList = new TaskList();
        ViewTasks viewTasks = new ViewTasks();

        if (option.equalsIgnoreCase(ADD_TASK)) {
            taskList.addTask(CommonMethods.getUserInput("Task Name: "),
                    CommonMethods.getUserInput("Task complete time in 'MM/dd/yyyy' format: "),
                    CommonMethods.getUserInput("Task description: "));
        } else if (option.equalsIgnoreCase(DELETE_TASK)) {
            taskList.deleteTask(CommonMethods.getUserInput("Task number: "));
        } else if (option.equalsIgnoreCase(VIEW_ALL_TASKS)) {
            viewTasks.printTasks();
        } else if (option.equalsIgnoreCase(EXIT)) {
            addMore = false;
        }
    }
}
