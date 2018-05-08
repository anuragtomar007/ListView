package com.example.railsfactory.listdisplay;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    private ArrayList<String> mobileArray;
    private ArrayList<String> mobileCompanyArray;
    private Button btn;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mobileArray = new ArrayList<String>();
        mobileCompanyArray= new ArrayList<String>();
        btn=findViewById(R.id.clk);

//        mobileArray.add("Android");
//        mobileArray.add("Iphone");
//        mobileArray.add("WindowsMobile");
//        mobileArray.add("Blackberry");
//        mobileArray.add("WebOS");
//        mobileArray.add("Ubuntu");
//        mobileArray.add("Mac OS X");
//        mobileArray.add("Windows 7");

        mobileCompanyArray.add("Samsung");
        mobileCompanyArray.add("Apple");
        mobileCompanyArray.add("Google");
        mobileCompanyArray.add("Lenovo");
        mobileCompanyArray.add("Xiomi");

//        ArrayAdapter adapter = new ArrayAdapter<String>(this,
//                R.layout.activity_listview, mobileArray);
//        listView = findViewById(R.id.mobile_list);
//        listView.setAdapter(adapter);

     ArrayAdapter adapter1 = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileCompanyArray);
        listView = findViewById(R.id.mobile_list);
        listView.setAdapter(adapter1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putStringArrayListExtra("key",mobileCompanyArray );
//                i.putExtra("key",mobileCompanyArray);
                startActivity(i);
            }
        });
    }
}