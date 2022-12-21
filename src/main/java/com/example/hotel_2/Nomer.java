package com.example.hotel_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Nomer extends AppCompatActivity {

    private TextView Name;
    private TextView Ima;
    private TextView Zena;
    private TextView Vmect;
    private TextView Opis;
    private ImageView Foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomer);
        Bundle arguments = getIntent().getExtras();
        Name = (TextView) findViewById(R.id.textView21);
        Ima = (TextView) findViewById(R.id.textView31);
        Zena = (TextView) findViewById(R.id.textView32);
        Vmect = (TextView) findViewById(R.id.textView33);
        Opis = (TextView) findViewById(R.id.textView34);
        Foto = (ImageView) findViewById(R.id.imageView8);
        Name.setText(arguments.get("key").toString());
        Ima.setText(arguments.get("name").toString());
        Zena.setText(arguments.get("cost").toString());
        Vmect.setText(arguments.get("coll").toString());
        Opis.setText(arguments.get("opis").toString());
        Foto.setImageResource((int) arguments.get("image"));

    }
    public void Back(View view) {
        finish();
    }

    public void Back_1(View view) {
        Toast.makeText(this, "Номер забронирован", Toast.LENGTH_SHORT).show();
        finish();
    }
}