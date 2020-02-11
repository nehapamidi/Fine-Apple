package com.example.namrathap.cookbook;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.namrathap.cookbook.MESSAGE";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText height = findViewById(R.id.height);
        final EditText weight = findViewById(R.id.weight);
        Button submit = findViewById(R.id.calculate);
        final TextView test = findViewById(R.id.test);
        //final SharedPreferences sp = getSharedPreferences("Food Planner", MODE_PRIVATE);
        //final SharedPreferences.Editor editor = sp.edit();
        //test.setText(sp.getString("BMI", "NULL"));
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String idm = height.getText().toString();
                //editor.putString("BMI", idm);
                //editor.commit();
                double bmi = calculateBMI(height.getText().toString(), weight.getText().toString());

                test.setText(Double.toString(bmi));
                System.out.println(bmi);
                Bundle mBundle = new Bundle();
                mBundle.putDouble("bmi",bmi);
                Intent intent = new Intent(v.getContext(), FoodList.class);
                intent.putExtras(mBundle);
                startActivity(intent);

            }
        });
    }

    private double calculateBMI(String height, String weight){
        double h = Double.parseDouble(height);
        double w = Double.parseDouble(weight);
        double b = (w/h)/h;
        b = b*703;
        return b;
    }




}
