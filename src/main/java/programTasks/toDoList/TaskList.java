package programTasks.toDoList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Tasks> list = new ArrayList<>();

    public void addTask(Tasks name) {
       list.add(name);
    }

    public void deleteTask() {

    }
}
