/*  Course: Native App Studio
 *  Name: Tirza Soute
 *  This file contains the Java code that sets the visibility of the corresponding body part when
 *  a checkbox is checked. It also makes sure that the body parts that were already visible stay
 *  visible when the screen orientation changes.
 */

package com.example.tirza.soutetirza_pset1;

// Import necessary packages
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Save the visibility of every body part
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("arms", findViewById(R.id.arms).getVisibility());
        savedInstanceState.putInt("ears", findViewById(R.id.ears).getVisibility());
        savedInstanceState.putInt("eyebrows", findViewById(R.id.eyebrows).getVisibility());
        savedInstanceState.putInt("eyes", findViewById(R.id.eyes).getVisibility());
        savedInstanceState.putInt("glasses", findViewById(R.id.glasses).getVisibility());
        savedInstanceState.putInt("hat", findViewById(R.id.hat).getVisibility());
        savedInstanceState.putInt("mouth", findViewById(R.id.mouth).getVisibility());
        savedInstanceState.putInt("mustache", findViewById(R.id.mustache).getVisibility());
        savedInstanceState.putInt("nose", findViewById(R.id.nose).getVisibility());
        savedInstanceState.putInt("shoes", findViewById(R.id.shoes).getVisibility());

        super.onSaveInstanceState(savedInstanceState);
    }

    // Restore the visibility of every body part
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        findViewById(R.id.arms).setVisibility(savedInstanceState.getInt("arms"));
        findViewById(R.id.ears).setVisibility(savedInstanceState.getInt("ears"));
        findViewById(R.id.eyebrows).setVisibility(savedInstanceState.getInt("eyebrows"));
        findViewById(R.id.eyes).setVisibility(savedInstanceState.getInt("eyes"));
        findViewById(R.id.glasses).setVisibility(savedInstanceState.getInt("glasses"));
        findViewById(R.id.hat).setVisibility(savedInstanceState.getInt("hat"));
        findViewById(R.id.mouth).setVisibility(savedInstanceState.getInt("mouth"));
        findViewById(R.id.mustache).setVisibility(savedInstanceState.getInt("mustache"));
        findViewById(R.id.nose).setVisibility(savedInstanceState.getInt("nose"));
        findViewById(R.id.shoes).setVisibility(savedInstanceState.getInt("shoes"));
    }

    // Set the visibility of every body part if the checkbox is checked by the user
    public void boxChecked(View view) {
        CheckBox checkBox = (CheckBox) view;
        boolean checked = checkBox.isChecked();
        View arms = findViewById(R.id.arms);
        View ears = findViewById(R.id.ears);
        View eyebrows = findViewById(R.id.eyebrows);
        View eyes = findViewById(R.id.eyes);
        View glasses = findViewById(R.id.glasses);
        View hat = findViewById(R.id.hat);
        View mouth = findViewById(R.id.mouth);
        View mustache = findViewById(R.id.mustache);
        View nose = findViewById(R.id.nose);
        View shoes = findViewById(R.id.shoes);

        switch (checkBox.getId()) {
            case R.id.armsBox:
                if (checked) arms.setVisibility(View.VISIBLE);
                else arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.earsBox:
                if (checked) ears.setVisibility(View.VISIBLE);
                else ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyebrowsBox:
                if (checked) eyebrows.setVisibility(View.VISIBLE);
                else eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyesBox:
                if (checked) eyes.setVisibility(View.VISIBLE);
                else eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.glassesBox:
                if (checked) glasses.setVisibility(View.VISIBLE);
                else glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.hatBox:
                if (checked) hat.setVisibility(View.VISIBLE);
                else hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.mouthBox:
                if (checked) mouth.setVisibility(View.VISIBLE);
                else mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.mustacheBox:
                if (checked) mustache.setVisibility(View.VISIBLE);
                else mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.noseBox:
                if (checked) nose.setVisibility(View.VISIBLE);
                else nose.setVisibility(View.INVISIBLE);
                break;
            case R.id.shoesBox:
                if (checked) shoes.setVisibility(View.VISIBLE);
                else shoes.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
