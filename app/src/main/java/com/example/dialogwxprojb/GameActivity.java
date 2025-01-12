package com.example.dialogwxprojb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et1, et2;
    private TextView tv;
    private Button btnCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        this.et1 = findViewById(R.id.et1);
        this.et2 = findViewById(R.id.et2);
        tv = findViewById(R.id.tv);
        btnCalc = findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(this);

        Random rnd = new Random();
        int num1 = rnd.nextInt(10);
        int num2 = rnd.nextInt(10);
        et1.setHint("" + num1 + "+" + num2);
        String str = "" + (num1+num2);

    }

    @Override
    public void onClick(View v) {
        int couner = 0;
        if(et1.getText().toString().equals("5"))
            couner++;
        if(et2.getText().toString().equals("20"))
            couner++;
        tv.setText("You have "+couner +" Points");

        CustomDialog customDialog = new CustomDialog(this);
        customDialog.show();
    }


    public void reset() {
        et1.setText("");
        et2.setText("");
    }
}