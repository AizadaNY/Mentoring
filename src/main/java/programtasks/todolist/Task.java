package programtasks.todolist;

public class Task {

    private String title;
    private String time;
    //id
    //description
    //

    public Task(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
