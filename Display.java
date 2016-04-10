package com.example.alex.voteanywherenow;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Alex on 2/28/2016.
 */
public class Display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.button) {
            Intent i = new Intent(Display.this, Submit.class);
            startActivity(i);
            finish();
        }
        if (v.getId() == R.id.button2) {
            Intent i = new Intent(Display.this, Submit1.class);
            startActivity(i);
            finish();
        }
        if (v.getId() == R.id.button3) {
            Intent i = new Intent(Display.this, Submit2.class);
            startActivity(i);
            finish();
        }
        if (v.getId() == R.id.button4) {
            Intent i = new Intent(Display.this, Submit3.class);
            startActivity(i);
            finish();
        }
        if (v.getId() == R.id.button5) {
            Intent i = new Intent(Display.this, Submit4.class);
            startActivity(i);
            finish();
        }
        if (v.getId() == R.id.button6) {
            Intent i = new Intent(Display.this, Submit5.class);
            startActivity(i);
            finish();
        }

    }


}



