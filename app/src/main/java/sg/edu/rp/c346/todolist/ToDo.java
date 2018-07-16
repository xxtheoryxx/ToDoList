package sg.edu.rp.c346.todolist;
import java.util.Calendar;

/**
 * Created by 15055494 on 16/7/2018.
 */

public class ToDo {
    private String title;
    private String date;
    Calendar date1 = Calendar.getInstance();


    public ToDo(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle(){
        return title;
    }

    public String getDateString(){
        date1.set(2018,7,1);
        date = date1.get(Calendar.DAY_OF_MONTH)+"/"+date1.get(Calendar.MONTH)+"/"+date1.get(Calendar.YEAR);
        return date;
    }
}
