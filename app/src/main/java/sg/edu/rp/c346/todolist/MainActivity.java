package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTodo;
    ArrayList<ToDo> alToDo;
    CustomAdapter caTodo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.listViewTodo);

        alToDo = new ArrayList<>();

        alToDo.add(new ToDo("MSA", "1/7/2018"));
        alToDo.add(new ToDo("Go for haircut", "22-9-2018"));

        caTodo = new CustomAdapter(this,R.layout.todo_row, alToDo);

        lvTodo.setAdapter(caTodo);
    }
}
