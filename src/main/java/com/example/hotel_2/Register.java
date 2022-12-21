package com.example.hotel_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    private EditText Log_1;
    private EditText Porol_1;
    private EditText FIO;
    private EditText Tel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Log_1 = (EditText) findViewById(R.id.Log_1);
        Porol_1 = (EditText) findViewById(R.id.Porol_1);
        FIO = (EditText) findViewById(R.id.FIO);
        Tel = (EditText) findViewById(R.id.Tel);

    }
    public void Back(View view) {
        String[][] log_porol = ((Useless) this.getApplication()).getSomeVariable();
        log_porol[0][1] = Log_1.getText().toString();
        log_porol[1][1] = Porol_1.getText().toString();
        log_porol[2][1] = FIO.getText().toString();
        log_porol[3][1] = Tel.getText().toString();
        ((Useless) this.getApplication()).setSomeVariable(log_porol);
        finish();

    }

    public void Back_1(View view) {
        finish();
    }
}