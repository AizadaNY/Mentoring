package programtasks.todolist;

import programtasks.CommonMethods;

public class UserOptions {

    private final int ADD_TASK=1;
    private final int DELETE_TASK=2;
    private final int VIEW_ALL_TASKS=3;
    private final int EXIT=0;

//    private boolean continue=false;

    public void selectOption(int option){

        TaskList taskList=new TaskList();
        ViewTasks viewTasks=new ViewTasks();

        if(option==ADD_TASK){
            taskList.addTask(CommonMethods.getUserInput("Task Name: "),CommonMethods.getUserInput("Task end time: "));
        }else if(option==DELETE_TASK){
            taskList.deleteTask(CommonMethods.getUserInput("Task number: "));
        }else if(option==VIEW_ALL_TASKS){
            viewTasks.printTasks();
        }else if(option==EXIT){
//            continue=true;
        }
    }
}
