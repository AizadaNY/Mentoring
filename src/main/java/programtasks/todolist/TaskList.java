package programtasks.todolist;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Task> list = new ArrayList<>();

    public void addTask(String name, String time,String desc) throws ParseException {
        Task task = new Task(name,time,desc);
        list.add(task);
    }

    public void deleteTask(int id ){
        list.remove(id - 1);
    }

}
