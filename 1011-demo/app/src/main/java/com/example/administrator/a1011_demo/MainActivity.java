package com.example.administrator.a1011_demo;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tv_text);

        final Handler handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
//                String str= (String) msg.obj;
//                tv.setText(str);
                int i=msg.what;
                tv.setText(i+"");
            }
        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while (true){
                    i++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    Message message=new Message();
//                    message.obj="aaa"+i;
//                    handler.sendMessage(message);
                    handler.sendEmptyMessage(i);
                }
            }
        }).start();
    }
}
