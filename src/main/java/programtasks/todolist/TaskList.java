package programtasks.todolist;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Task> list = new ArrayList<>();

    public void addTask(String name, String time) {

        Task task = new Task(name, time);
        list.add(task);
    }

    public void deleteTask(int number) {

        list.remove(number - 1);
    }

}
