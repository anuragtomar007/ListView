package com.example.railsfactory.listdisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ArrayList<String> test;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            test = bundle.getStringArrayList("key");
//          test =  (ArrayList<String>)getIntent().getSerializableExtra("key");
        }

        listview = findViewById(R.id.mobile_list2);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview,test );
        listview.setAdapter(adapter);
    }
}