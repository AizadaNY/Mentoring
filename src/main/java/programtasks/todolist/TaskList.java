package programtasks.todolist;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Tasks> list = new ArrayList<>();

    public void addTask(String name, String time) {

        Tasks task = new Tasks(name, time);
        list.add(task);
    }

    public void deleteTask(String name) {


    }

    public void deleteTask(int number) {

        list.remove(number - 1);
    }

}
