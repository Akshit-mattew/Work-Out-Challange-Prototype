package com.akshitgupta.mr.newtest5;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Reverse_Crunch extends AppCompatActivity {

    ImageView image;
    AnimationDrawable anime;
    private TextView tv1;
    ToggleButton togbtn;

    boolean isPaused = false;
    boolean isCancel = false;
    long remaingtime = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reverse__crunch);
        togbtn = (ToggleButton) findViewById(R.id.ret);
        tv1 = (TextView) findViewById(R.id.text);
        Intent a1 = getIntent();
        TextView text= (TextView)findViewById(R.id.textView3);



            text.setText(a1.getStringExtra("excercise"));



            togbtn.setText("");

        togbtn.setEnabled(true);
        isPaused = false;
        isCancel = false;

        start();
        toggle();

    }


    public void back(View v) {
    }


    public void toggle() {

        togbtn.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if (togbtn.isChecked()) {


                            isPaused = true;
                        } else {
                            tv1.setTextColor(Color.parseColor("#ff88060f"));
                            isPaused = false;
                            final long millInfuture = remaingtime;
                            long counterDownInterval = 1000;
                            new CountDownTimer(millInfuture, counterDownInterval) {

                                @Override
                                public void onTick(long millisUntilFinished) {
                                    if (isPaused)

                                    {
                                        tv1.setTextColor(Color.parseColor("#ff932c34"));
                                        image = (ImageView) findViewById(R.id.image);
                                        if (image == null) throw new AssertionError();
                                        image.setBackgroundResource(R.drawable.animationmyalternating);
                                        anime = (AnimationDrawable) image.getBackground();
                                        anime.stop();
                                        tv1.setTextSize(50);
                                        delay();
                                        tv1.setTextSize(40);

                                        cancel();
                                    } else {
                                        tv1.setTextColor(Color.parseColor("#ff88060f"));
                                        image = (ImageView) findViewById(R.id.image);
                                        if (image == null) throw new AssertionError();
                                        image.setBackgroundResource(R.drawable.animationmyalternating);
                                        anime = (AnimationDrawable) image.getBackground();
                                        anime.start();


                                        tv1.setText("" + millisUntilFinished / 1000);
                                        tv1.setTextSize(50);
                                        delay();
                                        tv1.setTextSize(40);

                                        remaingtime = millisUntilFinished;


                                    }
                                }

                                @Override
                                public void onFinish() {
                                    Intent b = getIntent();
                                    if (b.getStringExtra("excerciseu").contentEquals("abs")) {
                                        Intent a1 = new Intent(getApplicationContext(), Lower_Abs.class);
                                        a1.putExtra("excerciseu", "abs");
                                        startActivity(a1);
                                    }
                                    if (b.getStringExtra("excercisel").contentEquals("low")) {
                                        Intent a2 = new Intent(getApplicationContext(), Abs_Double_Twist.class);
                                        a2.putExtra("excercisel", "abs");
                                        startActivity(a2);

                                    }

                                }
                            }.start();
                        }


                    }
                });
    }

    public void start() {
        final long millInfuture = 10000;
        long counterDownInterval = 1000;
        new CountDownTimer(millInfuture, counterDownInterval) {

            @Override
            public void onTick(long millisUntilFinished) {
                if (isPaused || isCancel)

                {
                    image = (ImageView) findViewById(R.id.image);
                    if (image == null) throw new AssertionError();
                    image.setBackgroundResource(R.drawable.animationmyalternating);
                    anime = (AnimationDrawable) image.getBackground();
                    anime.stop();

                    cancel();
                } else {
                    image = (ImageView) findViewById(R.id.image);
                    if (image == null) throw new AssertionError();
                    image.setBackgroundResource(R.drawable.animationmyalternating);
                    anime = (AnimationDrawable) image.getBackground();
                    anime.start();

                    tv1.setText("" + millisUntilFinished / 1000);
                    remaingtime = millisUntilFinished;

                }
            }

            @Override
            public void onFinish() {


            }
        }.start();

    }


    public void delay() {

        Thread t = new Thread() {
            @Override
            public void run() {

                try {
                    Thread.sleep(100);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        t.start();

    }

/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mmy1:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);

                break;
            case R.id.my:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent m=new Intent(this,Developers.class);

                startActivity(m);

        }
    }
    */


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mmy1:
                if (item.isChecked())
                    item.setChecked(false);
                else item.setChecked(true);
                Intent excercise = new Intent(this, AboutExcer.class);
                startActivity(excercise);
                break;

            case R.id.my:
                if (item.isChecked())
                    item.setChecked(false);
                else item.setChecked(true);
                Intent develop = new Intent(this, Developers.class);
                startActivity(develop);
                break;

        }
        return true;
    }





    public void fwd(View v) {

        Intent a1 = getIntent();
        if (a1.getStringExtra("excercise").contentEquals("upper")) {
            Intent b = new Intent(getApplicationContext(), Abs_Push_Through.class);
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
