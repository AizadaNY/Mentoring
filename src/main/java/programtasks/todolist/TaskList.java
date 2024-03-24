package programtasks.todolist;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Task> list = new ArrayList<>();

    public void addTask(String name, String time,String desc,String compDate) throws ParseException {
        Task task = new Task(name, time,desc,compDate);
        list.add(task);
    }

    public void deleteTask(int number) {

        list.remove(number - 1);
    }

}
