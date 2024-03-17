package programtasks.todolist;

public class Tasks {

    private String title;
    private String time;

    public Tasks(String title,String time) {
        this.title=title;
        this.time=time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
