package com.example.prokrytkalesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView jeri, tom;
    boolean b = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       jeri = findViewById(R.id.jeri);
       tom = findViewById(R.id.tom);
    }
    public void onClick(View view){
        if(b){
           jeri.animate().alpha(0).setDuration(3000);
           jeri.animate().rotation(1800f).setDuration(3000);
           tom.animate().alpha(1).setDuration(3000);
           tom.animate().rotation(1800f).setDuration(3000);

           b = false;
        }else {
            jeri.animate().alpha(1).setDuration(3000);
            jeri.animate().rotation(3600f).setDuration(3000);
            tom.animate().alpha(0).setDuration(3000);
            tom.animate().rotation(3600f).setDuration(3000);
            b = true;

        }

    }
}