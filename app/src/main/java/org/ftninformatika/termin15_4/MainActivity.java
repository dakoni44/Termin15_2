package org.ftninformatika.termin15_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lwItems;
    private List<Person> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lwItems=findViewById(R.id.lwItems);
        data=getData();
        MyAdapter adapter =new MyAdapter(this, data);
        lwItems.setAdapter(adapter);

    }

    List<Person> getData(){
        List<Person> dummyData=new ArrayList<>();
        for (int i=0;i<20;i++){
            dummyData.add(new Person("Name "+ i,"Description "+i));
        }
        return dummyData;
    }
}
