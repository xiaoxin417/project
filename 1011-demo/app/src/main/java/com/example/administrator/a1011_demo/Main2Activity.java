package com.example.administrator.a1011_demo;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ImageView iv;
    int imageid[]={R.drawable.green,R.drawable.red,R.drawable.yellow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        iv= (ImageView) findViewById(R.id.iv_image);

        final Handler handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                int i= (int) msg.obj;
                iv.setImageResource(imageid[i]);
            }
        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                int j=0;
                int i=0;
                while (true){
                    i=j%imageid.length;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    j++;
                    Message message=new Message();
                    message.obj=i;
                    handler.sendMessage(message);
                }
            }
        }).start();
    }
}
