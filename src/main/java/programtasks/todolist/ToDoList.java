package programtasks.todolist;

import programtasks.CommonMethods;

import java.text.ParseException;

public class ToDoList {

    /*
    Todo List: Create a simple command-line to-do list application where users can add tasks,
     view all tasks, and delete a task.
     This will introduce arrays or arraylists and the basics of CRUD (Create, Read, Update, Delete) operations.

     */

    public static void main(String[] args) throws ParseException {

        while (UserOptions.addMore) {
            UserOptions options = new UserOptions();
            options.selectOption(CommonMethods.getUserInput(Messages.selectOptionMsg));
        }
    }


    //view not working

}
