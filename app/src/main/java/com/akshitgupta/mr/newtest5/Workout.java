
package com.akshitgupta.mr.newtest5;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class Workout extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_category);

        load();


    }

    public void load() {
        RadioButton Upper = (RadioButton) findViewById(R.id.Upper);
        RadioButton Lower = (RadioButton) findViewById(R.id.Lower);
        RadioButton Full = (RadioButton) findViewById(R.id.Full);

        RadioButton Major = (RadioButton) findViewById(R.id.Major);
        RadioButton Calorie = (RadioButton) findViewById(R.id.Calorie);
        RadioButton Light = (RadioButton) findViewById(R.id.Light);

        RadioButton Belly = (RadioButton) findViewById(R.id.Belly);
        RadioButton Tone = (RadioButton) findViewById(R.id.Tone);
        RadioButton Stretch = (RadioButton) findViewById(R.id.Stretch);

        RadioButton Fat = (RadioButton) findViewById(R.id.Fat);


        SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
        String name = sharedpref.getString("category", "");

        if (name.contentEquals("Upper Body")) {
            Upper.setChecked(true);
            Lower.setChecked(false);
            Full.setChecked(false);

            Major.setChecked(false);
            Fat.setChecked(false);
            Calorie.setChecked(false);
            Belly.setChecked(false);
            Stretch.setChecked(false);
            Light.setChecked(false);
            Tone.setChecked(false);
        }
        if (name.contentEquals("Lower Body")) {
            Upper.setChecked(false);
            Lower.setChecked(true);
            Full.setChecked(false);


            Major.setChecked(false);
            Fat.setChecked(false);
            Calorie.setChecked(false);
            Belly.setChecked(false);
            Stretch.setChecked(false);
            Light.setChecked(false);
            Tone.setChecked(false);
        }
        if (name.contentEquals("Full Body")) {
            Lower.setChecked(false);
            Full.setChecked(true);
            Upper.setChecked(false);


            Major.setChecked(false);
            Fat.setChecked(false);
            Calorie.setChecked(false);
            Belly.setChecked(false);
            Stretch.setChecked(false);
            Light.setChecked(false);
            Tone.setChecked(false);
        }

        if (name.contentEquals("Tone Up")) {
            Lower.setChecked(false);
            Full.setChecked(false);
            Upper.setChecked(false);


            Major.setChecked(false);
            Fat.setChecked(false);
            Calorie.setChecked(false);
            Belly.setChecked(false);
            Stretch.setChecked(false);
            Light.setChecked(false);
            Tone.setChecked(true);
        }

        if (name.contentEquals("Calorie Burn")) {
            Lower.setChecked(false);
            Full.setChecked(false);
            Upper.setChecked(false);


            Major.setChecked(false);
            Fat.setChecked(false);
            Calorie.setChecked(true);
            Belly.setChecked(false);
            Stretch.setChecked(false);
            Light.setChecked(false);
            Tone.setChecked(false);
        }

        if (name.contentEquals("Fat Burn")) {
            Lower.setChecked(false);
            Full.setChecked(false);
            Upper.setChecked(false);


            Major.setChecked(false);
            Fat.setChecked(true);
            Calorie.setChecked(false);
            Belly.setChecked(false);
            Stretch.setChecked(false);
            Light.setChecked(false);
            Tone.setChecked(false);
        }

        if (name.contentEquals("Belly Burn")) {
            Lower.setChecked(false);
            Full.setChecked(false);
            Upper.setChecked(false);


            Major.setChecked(false);
            Fat.setChecked(false);
            Calorie.setChecked(false);
            Belly.setChecked(true);
            Stretch.setChecked(false);
            Light.setChecked(false);
            Tone.setChecked(false);
        }

        if (name.contentEquals("Light Up")) {
            Lower.setChecked(false);
            Full.setChecked(false);
            Upper.setChecked(false);


            Major.setChecked(false);
            Fat.setChecked(false);
            Calorie.setChecked(false);
            Belly.setChecked(false);
            Stretch.setChecked(false);
            Light.setChecked(true);
            Tone.setChecked(false);
        }

        if (name.contentEquals("Major Muscles")) {
            Lower.setChecked(false);
            Full.setChecked(false);
            Upper.setChecked(false);


            Major.setChecked(true);
            Fat.setChecked(false);
            Calorie.setChecked(false);
            Belly.setChecked(false);
            Stretch.setChecked(false);
            Light.setChecked(false);
            Tone.setChecked(false);
        }

        if (name.contentEquals("Stretch Ups")) {
            Lower.setChecked(false);
            Full.setChecked(false);
            Upper.setChecked(false);


            Major.setChecked(false);
            Fat.setChecked(false);
            Calorie.setChecked(false);
            Belly.setChecked(false);
            Stretch.setChecked(true);
            Light.setChecked(false);
            Tone.setChecked(false);
        }








    }


    public void onClick(View v) {
        boolean checked = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.Upper:
                if (checked) {
                    Toast.makeText(Workout.this, "upper", Toast.LENGTH_LONG).show();
                    String up = "Upper Body";
                    SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor edit = sharedpref.edit();

                    edit.putString("category", up);

                    edit.apply();
                    Intent i = getIntent();

                        i.putExtra("categorymsg", up);
                        setResult(RESULT_OK, i);
                    this.finish();
                }
                break;


            case R.id.Lower:
                if (checked) {
                    Toast.makeText(Workout.this, "lower", Toast.LENGTH_LONG).show();

                    SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor edit = sharedpref.edit();
                    String lo = "Lower Body";
                    edit.putString("category", lo);

                    edit.apply();
                    Intent i = getIntent();

                    i.putExtra("categorymsg", lo);
                    setResult(RESULT_OK, i);
                    this.finish();

                }
                break;
            case R.id.Full:
                if (checked) {
                    Toast.makeText(Workout.this, "Full", Toast.LENGTH_LONG).show();
                    SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor edit = sharedpref.edit();
                    String fu = "Full Body";
                    edit.putString("category", fu);

                    edit.apply();
                    Intent i = getIntent();

                    i.putExtra("categorymsg", fu);
                    setResult(RESULT_OK, i);
                    this.finish();


                }
                break;

            case R.id.Stretch:
                if (checked) {
                    Toast.makeText(Workout.this, "Stretch", Toast.LENGTH_LONG).show();
                    String st = "Stretch Ups";
                    SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor edit = sharedpref.edit();

                    edit.putString("category", st);

                    edit.apply();
                    Intent i = getIntent();

                    i.putExtra("categorymsg", st);
                    setResult(RESULT_OK, i);
                    this.finish();
                }
                break;

            case R.id.Major:
                if (checked) {
                    Toast.makeText(Workout.this, "Major Muscles", Toast.LENGTH_LONG).show();
                    String mt = "Major Muscles";
                    SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor edit = sharedpref.edit();

                    edit.putString("category", mt);

                    edit.apply();
                    Intent i = getIntent();

                    i.putExtra("categorymsg", mt);
                    setResult(RESULT_OK, i);
                    this.finish();
                }
                break;

            case R.id.Light:
                if (checked) {
                    Toast.makeText(Workout.this, "Light Up", Toast.LENGTH_LONG).show();
                    String lt = "Light Up";
                    SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor edit = sharedpref.edit();

                    edit.putString("category", lt);

                    edit.apply();
                    Intent i = getIntent();

                    i.putExtra("categorymsg", lt);
                    setResult(RESULT_OK, i);
                    this.finish();
                }
                break;

            case R.id.Belly:
                if (checked) {
                    Toast.makeText(Workout.this, "Belly Burn", Toast.LENGTH_LONG).show();
                    String bt = "Belly Burn";
                    SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor edit = sharedpref.edit();

                    edit.putString("category", bt);

                    edit.apply();
                    Intent i = getIntent();

                    i.putExtra("categorymsg", bt);
                    setResult(RESULT_OK, i);
                    this.finish();
                }
                break;

            case R.id.Fat:
                if (checked) {
                    Toast.makeText(Workout.this, "Fat Burn", Toast.LENGTH_LONG).show();
                    String ft = "Fat Burn";
                    SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor edit = sharedpref.edit();

                    edit.putString("category", ft);

                    edit.apply();
                    Intent i = getIntent();

                    i.putExtra("categorymsg", ft);
                    setResult(RESULT_OK, i);
                    this.finish();
                }
                break;

            case R.id.Calorie:
                if (checked) {
                    Toast.makeText(Workout.this, "Calorie Burn", Toast.LENGTH_LONG).show();
                    String ct = "Calorie Burn";
                    SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor edit = sharedpref.edit();

                    edit.putString("category", ct);

                    edit.apply();
                    Intent i = getIntent();

                    i.putExtra("categorymsg", ct);
                    setResult(RESULT_OK, i);
                    this.finish();
                }
                break;

            case R.id.Tone:
                if (checked) {
                    Toast.makeText(Workout.this, "Tone Up", Toast.LENGTH_LONG).show();
                    String tt = "Tone Up";
                    SharedPreferences sharedpref = PreferenceManager.getDefaultSharedPreferences(this);
                    SharedPreferences.Editor edit = sharedpref.edit();

                    edit.putString("category", tt);

                    edit.apply();
                    Intent i = getIntent();

                    i.putExtra("categorymsg", tt);
                    setResult(RESULT_OK, i);
                    this.finish();
                }
                break;



















        }


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
