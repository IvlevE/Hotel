package com.example.hotel_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Data extends AppCompatActivity {

    private TextView Name;
    private EditText Coll;
    private EditText Date1;
    private EditText Date2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Bundle arguments = getIntent().getExtras();
        Name = (TextView) findViewById(R.id.textView21);
        Coll = (EditText) findViewById(R.id.Coll);
        Date1 = (EditText) findViewById(R.id.Date1);
        Date2 = (EditText) findViewById(R.id.Date2);
        Name.setText(arguments.get("key").toString());
    }

    public void Poisk(View view) {
        Bundle arguments = getIntent().getExtras();

        if  (Date1.getText().toString().trim().equals("")||
                (Date2.getText().toString().trim().equals("")) ||(Name.getText().toString().trim().equals("")))
        {
            Toast.makeText(this, "Введите всю информацию", Toast.LENGTH_SHORT).show();
        }

        else
        {
            Intent intent = new Intent(this,Katalog.class);
            intent.putExtra("key",Name.getText().toString());
            intent.putExtra("coll",Coll.getText().toString());
            startActivity(intent);
        }

    }
}