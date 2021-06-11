package com.example.assignment8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String name[]={"benz","bmw","ferrari","langonda","royals"};
    String desp[]={"benz car highend"," BMW cars sports","ferrari car super speed","Langonda ruf ruf cAR","royals bussiness car"};
    int picture[]={R.drawable.benz,R.drawable.bmw,R.drawable.ferrari,R.drawable.langonda,R.drawable.royals};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listview);
        lv.setAdapter(new myAdapter(this));
    }
    private class myAdapter extends BaseAdapter {
        Context mycontext;
        public myAdapter(MainActivity mainActivity) {
            mycontext=mainActivity;
        }
        @Override
        public int getCount() {
            return name.length;
        }
        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view= LayoutInflater.from(mycontext).inflate(R.layout.singleitem,parent,false);
            TextView t1=view.findViewById(R.id.textView);
            TextView t2=view.findViewById(R.id.textView2);
            ImageView iv=view.findViewById(R.id.imageView);
            Button b1=view.findViewById(R.id.button);
            t1.setText(name[position]);
            t2.setText(desp[position]);
            iv.setImageResource(picture[position]);
            b1.setText("click me");
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                    i.putExtra("item name",name[position]);
                    i.putExtra("item desc",desp[position]);
                    i.putExtra("item image",picture[position]);
                    startActivity(i);
                }
            });
            return view;
        }

    }
}