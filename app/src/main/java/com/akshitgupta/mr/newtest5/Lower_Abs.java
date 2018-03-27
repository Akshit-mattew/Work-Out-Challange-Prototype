package com.akshitgupta.mr.newtest5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Lower_Abs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lower_abs);


    }
    public void next(View v){
        Intent i = getIntent();
        String msg= i.getStringExtra("type");

        if (msg.contentEquals("Lower Body"))
        {
            Intent lower2= new Intent(this,Abs_Double_Twist
                    .class);
            startActivity(lower2);
        }



    }

}
