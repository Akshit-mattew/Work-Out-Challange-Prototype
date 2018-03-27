package com.akshitgupta.mr.newtest5;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
 String global;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

Adapter();;
load();
        clicknew();
    }

    public void onClick(View v){
        TextView test=(TextView)findViewById(R.id.text2);
        SharedPreferences sharedprefmain = PreferenceManager.getDefaultSharedPreferences(this);
        String name = sharedprefmain.getString("category_main", "");
        test.setText(name);

        if (name.contentEquals("Upper Body")) {

            Intent b = new Intent(getApplicationContext(),Abs_Double_Twist.class);

            b.putExtra("type", name);
            startActivityForResult(b,1);
        }
        if (name.contentEquals("Lower Body")) {

            Intent lower = new Intent(getApplicationContext(),Lower_Abs.class);
            lower.putExtra("type", name);
            startActivityForResult(lower,1);
        }

    }
    public void Adapter(){

        String[]  me = {"Workout", "Circuits"};
        ListAdapter buckyadapter= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,me);
        final ListView listview=(ListView)findViewById(R.id.listView);
        listview.setAdapter(buckyadapter);

        listview.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Integer pos = parent.getPositionForView(view);

                        Toast.makeText(MainActivity.this, pos + "", Toast.LENGTH_LONG).show();


                        if (pos == 0) {



                            Intent i = new Intent(getApplicationContext(),Workout.class);

                            i.putExtra("car","aa");
                            startActivityForResult(i,1);

                        }

                        if (pos == 1) {
                            Intent j = new Intent(getApplicationContext(), circuits.class);

                            j.putExtra("cir", "defaultone");
                            startActivityForResult(j, 1);
                        }
                    }
                }

        );
    }



    public void clicknew(){

ImageButton image =(ImageButton)findViewById(R.id.imagestart);
        image.setOnClickListener(
                new ImageButton.OnClickListener(){
                    public  void onClick(View v) {
                        SharedPreferences sharedprefmain = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                        String comp = sharedprefmain.getString("category_main", "");
                        String cir ="qw";
                        String time ="oa";

                        if (comp.contentEquals("Upper Body")) {
                            Intent b = new Intent(getApplicationContext(), Arms_Shoulder_Burpees.class);
                            b.putExtra("excercise", "upper");

                            b.putExtra("timer",time);
                            b.putExtra("circuits",cir);
                            startActivity(b);

                        }
                        if (comp.contentEquals("Lower Body")) {
                            Intent b = new Intent(getApplicationContext(), Abs_Times.class);
                            b.putExtra("excercise", "low");

                            b.putExtra("timer",time);
                            b.putExtra("circuits",cir);
                            startActivity(b);
                        }
                        if (comp.contentEquals("Tone Up")) {
                            Intent b = new Intent(getApplicationContext(), Abs_Double_Twist.class);
                            b.putExtra("excercise", "tone");

                            b.putExtra("timer",time);
                            b.putExtra("circuits",cir);
                            startActivity(b);
                        }


                        if (comp.contentEquals("Full Body")) {
                            Intent b = new Intent(getApplicationContext(), Arms_Push_Ups.class);
                            b.putExtra("excercise", "full");

                            b.putExtra("timer",time);
                            b.putExtra("circuits",cir);
                            startActivity(b);
                                }
                        if (comp.contentEquals("Calorie Burn")) {
                            Intent b = new Intent(getApplicationContext(), Abs_Double_Twist.class);
                            b.putExtra("excercise", "calorie");

                            b.putExtra("timer",time);
                            b.putExtra("circuits",cir);
                            startActivity(b);
                                    }
                        if (comp.contentEquals("Fat Burn")) {
                            Intent b = new Intent(getApplicationContext(), Abs_Double_Twist.class);
                            b.putExtra("excercise", "fat");

                            b.putExtra("timer",time);
                            b.putExtra("circuits",cir);
                            startActivity(b);
                                        }
                        if (comp.contentEquals("Belly Burn")) {
                            Intent b = new Intent(getApplicationContext(), Abs_Double_Twist.class);
                            b.putExtra("excercise", "belly");

                            b.putExtra("timer",time);
                            b.putExtra("circuits",cir);
                            startActivity(b);


                                            }
                        if (comp.contentEquals("Light Up")) {
                            Intent b = new Intent(getApplicationContext(), Abs_Double_Twist.class);
                            b.putExtra("excercise", "light");

                            b.putExtra("timer",time);
                            b.putExtra("circuits",cir);
                            startActivity(b);
                                                }
                        if (comp.contentEquals("Major Muscles")) {
                            Intent b = new Intent(getApplicationContext(), Abs_Alternating_Beats.class);
                            b.putExtra("excercise", "major");

                            b.putExtra("timer",time);
                            b.putExtra("circuits",cir);
                            startActivity(b);;
                                                    }

                        if (comp.contentEquals("Stretch Ups")) {
                            Intent b = new Intent(getApplicationContext(), Abs_Alternating_Curls.class);
                            b.putExtra("excercise", "stretch");

                            b.putExtra("timer",time);
                            b.putExtra("circuits",cir);
                            startActivity(b);;
                                                        }

                                                        }
                    }

        );


    }

  /*
public  void Startexcer(){

    SharedPreferences sharedprefmain = PreferenceManager.getDefaultSharedPreferences(this);
    String comp = sharedprefmain.getString("category_main", "");
    if(comp.contentEquals("Upper Body"))
    {
        Intent abs = new Intent(this,Abs_Double_Twist.class);
        abs.putExtra("cir", "defaultone");
        startActivity(abs);
    }
    if(comp.contentEquals("Lower Body"))
    {
        Intent low = new Intent(this,Lower_Abs.class);
        low.putExtra("cir", "defaultone");
        startActivity(low);
    }

}
*/
    public void load(){
        TextView text= (TextView)findViewById(R.id.text);
        SharedPreferences sharedprefmain = PreferenceManager.getDefaultSharedPreferences(this);
        String name = sharedprefmain.getString("category_main", "");
        global = sharedprefmain.getString("category_main", "");
        if (name.contentEquals("Upper Body")) {
            text.setText("Upper Body");
        }
        if (name.contentEquals("Lower Body")) {
            text.setText("Lower Body");
        }
        if (name.contentEquals("Full Body")) {
            text.setText("Full Body");
        }

        if (name.contentEquals("Tone Up")) {
            text.setText("Tone Up");
        }

        if (name.contentEquals("Calorie Burn")) {
            text.setText("Calorie Burn");
        }

        if (name.contentEquals("Fat Burn")) {
            text.setText("Fat Burn");
        }

        if (name.contentEquals("Belly Burn")) {
            text.setText("Belly Burn");
        }

        if (name.contentEquals("Light Up")) {
            text.setText("Light Up");
        }

        if (name.contentEquals("Major Muscles")) {
            text.setText("Major Muscles");
        }

        if (name.contentEquals("Stretch Ups")) {
            text.setText("Stretch Ups");
        }















    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView text= (TextView)findViewById(R.id.text);

        if(data.getExtras().containsKey("categorymsg"))
        {
            text.setText(data.getStringExtra("categorymsg"));


        }


            SharedPreferences sharedprefmain = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor edit = sharedprefmain.edit();
String txt= text.getText().toString();
            edit.putString("category_main", txt);

            edit.apply();

        }
    }






