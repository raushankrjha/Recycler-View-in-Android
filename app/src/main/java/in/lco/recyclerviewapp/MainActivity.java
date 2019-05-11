package in.lco.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView courselist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courselist=findViewById(R.id.recycleview);
        courselist.setLayoutManager(new LinearLayoutManager(this));
        String course[]={"java","html","android","flutter","React native","Python","Machine Learning","PHP","JavaScript"};
        courselist.setAdapter(new CourseAdapter(course));
    }
}
