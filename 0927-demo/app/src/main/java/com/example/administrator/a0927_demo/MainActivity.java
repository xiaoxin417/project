package com.example.administrator.a0927_demo;

import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.main.Student;

public class MainActivity extends AppCompatActivity {

    Button tz;
    Button ys;
    Button dh;
    Button dx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tz= (Button) findViewById(R.id.bt_tz);
        tz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,tzActivity.class);
//                intent.putExtra("name","wangyu");
                Student student=new Student("王宇",3,"男");
                intent.putExtra("stu",student);
                startActivity(intent);
            }
        });
        System.out.println("1--------------------onCreate");
        ys= (Button) findViewById(R.id.bt_ys);
        ys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("com.yinshi");
                startActivity(intent);
            }
        });
        dh= (Button) findViewById(R.id.bt_phone);
        dh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:110"));
                startActivity(intent);
            }
        });
        dx= (Button) findViewById(R.id.bt_dx);
        dx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:232142342"));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        System.out.println("1------------------------onSaveInstanceState");
    }

    protected void onStart(){
        super.onStart();
        System.out.println("1-----------------------onStart");
    }
    protected void onResume(){
        super.onResume();
        System.out.println("1-----------------------onResume");
    }
    protected void onPause(){
        super.onPause();
        System.out.println("1--------------------------onPause");
    }
    protected void onStop(){
        super.onStop();
        System.out.println("1-------------------------onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("1---------------------------onDestroy");
    }
    protected void onRestart(){
        super.onRestart();
        System.out.println("1-----------------------------onRestart");
    }
}
