package com.akshitgupta.mr.newtest5;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Triceps_Kick_Back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triceps__kick__back);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void fwd(View v) {

        Intent a1 = getIntent();
        if (a1.getStringExtra("excercise").contentEquals("upper")) {
            Intent b = new Intent(getApplicationContext(), Arms_Backpull_Ups.class);
            a1.putExtra("excercise", "abs");
            String cir =b.getStringExtra("circuits");
            String time = b.getStringExtra("timer");

            b.putExtra("timer",time);
            b.putExtra("circuits",cir);
            startActivity(b);
        }
        if (a1.getStringExtra("excercise").contentEquals("low")) {
            Intent b = new Intent(getApplicationContext(), ButtocksHipAductionWithSwiisBall.class);
            a1.putExtra("excercise", "abs");
            String cir =b.getStringExtra("circuits");
            String time = b.getStringExtra("timer");

            b.putExtra("timer",time);
            b.putExtra("circuits",cir);
            startActivity(b);
        }

        if (a1.getStringExtra("excercise").contentEquals("full")) {
            Intent b = new Intent(getApplicationContext(), ButtocksHipAductionWithSwiisBall.class);
            a1.putExtra("excercise", "abs");
            String cir =b.getStringExtra("circuits");
            String time = b.getStringExtra("timer");

            b.putExtra("timer",time);
            b.putExtra("circuits",cir);
            startActivity(b);
        }

        if (a1.getStringExtra("excercise").contentEquals("belly")) {
            Intent b = new Intent(getApplicationContext(), ButtocksHipAductionWithSwiisBall.class);
            a1.putExtra("excercise", "abs");
            String cir =b.getStringExtra("circuits");
            String time = b.getStringExtra("timer");

            b.putExtra("timer",time);
            b.putExtra("circuits",cir);
            startActivity(b);
        }

        if (a1.getStringExtra("excercise").contentEquals("major")) {
            Intent b = new Intent(getApplicationContext(), ButtocksHipAductionWithSwiisBall.class);
            a1.putExtra("excercise", "abs");
            String cir =b.getStringExtra("circuits");
            String time = b.getStringExtra("timer");

            b.putExtra("timer",time);
            b.putExtra("circuits",cir);
            startActivity(b);
        }

        if (a1.getStringExtra("excercise").contentEquals("stretch")) {
            Intent b = new Intent(getApplicationContext(), ButtocksHipAductionWithSwiisBall.class);
            a1.putExtra("excercise", "abs");
            String cir =b.getStringExtra("circuits");
            String time = b.getStringExtra("timer");

            b.putExtra("timer",time);
            b.putExtra("circuits",cir);
            startActivity(b);
        }

    }
}
