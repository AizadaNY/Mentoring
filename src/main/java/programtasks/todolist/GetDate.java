package programtasks.todolist;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class GetDate {

    public static LocalDate getCurrentDate(){
        LocalDate myObj = LocalDate.now();
        return myObj;
    }

    public static Date getCompleteDate(String strDate) throws ParseException {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date compDate = null;
        try {
            compDate = df.parse(strDate);
            String newDateString = df.format(compDate);
            System.out.println(newDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return compDate;
    }
}
