package com.example.administrator.a0927_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class XinWenListActivity extends AppCompatActivity {
    ListView lb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xin_wen);
        lb= (ListView) findViewById(R.id.lv_xw);
        ArrayList<HashMap<String,Object>> list=new ArrayList<HashMap<String,Object>>();

        HashMap<String,Object> map1=new HashMap<String,Object>();
        map1.put("image",R.drawable.one);
        map1.put("title","今日头条");
        map1.put("body","噢噢噢噢噢噢噢噢哦哦哦");
        map1.put("comment","2201");
        HashMap<String,Object> map2=new HashMap<String,Object>();
        map2.put("image",R.drawable.six);
        map2.put("title","今日二条");
        map2.put("body","噢噢噢噢噢噢噢噢哦哦");
        map2.put("comment","800");
        HashMap<String,Object> map3=new HashMap<String,Object>();
        map3.put("image",R.drawable.five);
        map3.put("title","今日三条");
        map3.put("body","噢噢噢噢噢噢噢噢");
        map3.put("comment","500");

        list.add(map1);
        list.add(map2);
        list.add(map3);

        SimpleAdapter adapter=new SimpleAdapter(this,list,R.layout.activity_xin_wen_list,new String[]{"image","title","body","comment"},new int[]{R.id.iv_tp,R.id.tv_text1,R.id.tv_text2,R.id.tv_text3});
        lb.setAdapter(adapter);


    }
}
