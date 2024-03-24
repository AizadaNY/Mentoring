package programtasks.todolist;

import java.text.ParseException;

public class Task {

    private String title;
    private String createdTime;
    private String completeTime;
    private static int id=0;
    private String description;

    public Task(String title, String completeTime,String description,String completeDate) throws ParseException {
        this.title = title;
        this.completeTime =completeTime;
        this.description=description;
        id=id++;
        createdTime=GetDate.getCurrentDate().toString();
        completeTime=GetDate.getCompleteDate(completeDate).toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
