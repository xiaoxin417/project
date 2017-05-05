package com.example.administrator.a0927_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.main.Student;

import java.io.Serializable;

public class tzActivity extends AppCompatActivity {

    Button sy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tz);

        Intent i=getIntent();
//        String name=i.getStringExtra("name");
//        Toast.makeText(tzActivity.this,name+"-------",Toast.LENGTH_SHORT).show();

        Student s=(Student)i.getSerializableExtra("stu");

        Toast.makeText(tzActivity.this,s.name+s.age+s.sex,Toast.LENGTH_SHORT).show();

        sy= (Button) findViewById(R.id.bt_sy);
        sy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(tzActivity.this,MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });
        System.out.println("2-------------------------onCreate");
    }
    protected void onStart(){
        super.onStart();
        System.out.println("2----------------------------onStart");
    }
    protected void onResume(){
        super.onResume();
        System.out.println("2-------------------------------onResume");
    }
    protected void onPause(){
        super.onPause();
        System.out.println("2-------------------------------onPause");
    }
    protected void onStop(){
        super.onStop();
        System.out.println("2---------------------------------onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("2----------------------------------onDestroy");
    }
    protected void onRestart(){
        super.onRestart();
        System.out.println("2-----------------------------------onRestart");
    }
}
