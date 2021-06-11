package com.example.assignment8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    ImageView im;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        im=findViewById(R.id.imageView2);
        t1=findViewById(R.id.textView3);
        t2=findViewById(R.id.textView4);
        Intent i=getIntent();
        String itemname=i.getStringExtra("item name");
        String itemdesc=i.getStringExtra("item desc");
        int image=i.getIntExtra("item image",R.drawable.benz);
        im.setImageResource(image);
        t1.setText(itemname);
        t2.setText(itemdesc);

    }
}