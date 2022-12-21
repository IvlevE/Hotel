package com.example.hotel_2;

import static com.example.hotel_2.R.id.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Login;
    private EditText Porol;
    public Integer k = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (EditText) findViewById(R.id.Login);
        Porol = (EditText) findViewById(R.id.Porol);
        String[][] log_porol = ((Useless) this.getApplication()).getSomeVariable();
        log_porol[0][0] = "capitan";
        log_porol[1][0] = "floap";
        log_porol[2][0] = "Иванов Иван Иванович";
        log_porol[3][0] = "89143669091";
        ((Useless) this.getApplication()).setSomeVariable(log_porol);

    }

    public void Vhod(View view) {
        String[][] log_porol = ((Useless) this.getApplication()).getSomeVariable();
        for(int i = 0; i<6;i++){
            if ((log_porol[1][i].equals(Porol.getText().toString()))&&(log_porol[0][i].equals(Login.getText().toString()))){
                Intent intent = new Intent(this,Data.class);
                intent.putExtra("key",log_porol[2][i]);
                startActivity(intent);
            }
            k+=1;
        }
    }

    public void Register(View view) {
        String[][] log_porol = ((Useless) this.getApplication()).getSomeVariable();
        Intent intent2 = new Intent(this,Register.class);
        startActivity(intent2);
    }
}