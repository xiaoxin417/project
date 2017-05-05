package com.example.administrator.a0927_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView lb;
    GridView bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

//        lb= (ListView) findViewById(R.id.lv_lb);
//
//        String arr[]={"aaa","bbb","ccc","ddd","eee","fff","hhh","ggg"};
//
//        ArrayAdapter aa=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        lb.setAdapter(aa);

        bg= (GridView) findViewById(R.id.gv_bg);

        String arr[]={"aaa","bbb","ccc","ddd","eee","fff","hhh","ggg"};

        ArrayAdapter aa=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        bg.setAdapter(aa);

    }
}
