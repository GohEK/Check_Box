package com.example.check_box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chocolate,sprinkles,nuts,cherries,oreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chocolate = (CheckBox)findViewById(R.id.checkBox);
        sprinkles = (CheckBox)findViewById(R.id.checkBox2);
        nuts = (CheckBox)findViewById(R.id.checkBox3);
        cherries = (CheckBox)findViewById(R.id.checkBox4);
        oreo = (CheckBox)findViewById(R.id.checkBox5);
        Button toast = (Button)findViewById(R.id.Toast);

        toast.setOnClickListener(new View.OnClickListener()  {
            String result = "Toppings:";
            @Override
            public void onClick(View v) {
                if (chocolate.isChecked()) {
                    result += "\tChocolate Syrup";
                }
                if (sprinkles.isChecked()) {
                    result += "\tSprinkles";
                }
                if (nuts.isChecked()) {
                    result += "\tCrushed Nuts";
                }
                if (cherries.isChecked()) {
                    result += "\tCherries";
                }
                if (oreo.isChecked()) {
                    result += "\tOreo cookies crumbles";
                }
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                result = "Toppings:";
            }
        });
    }
}