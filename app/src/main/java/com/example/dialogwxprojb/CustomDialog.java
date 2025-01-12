package com.example.dialogwxprojb;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class CustomDialog extends Dialog implements View.OnClickListener
{
    private Button btnYes, btnNo;
    private Context context;
    public CustomDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.custom_dialog);


        this.context = context;

        this.btnYes = findViewById(R.id.btnYes);
        btnNo = findViewById(R.id.btnNo);
        btnYes.setOnClickListener(this);
        btnNo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Toast.makeText(getContext(), "onClick", Toast.LENGTH_SHORT).show();
        if(v == btnYes)
        {
            dismiss();
            ((GameActivity)context).reset();
        }
        if(v == btnNo)
        {
            ((GameActivity)context).finish();
        }

    }
}
