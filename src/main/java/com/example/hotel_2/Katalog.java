package com.example.hotel_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Katalog extends AppCompatActivity {

    private TextView Name;
    private LinearLayout One;
    private LinearLayout Two;
    private LinearLayout Three;
    private LinearLayout Fore;
    private LinearLayout Five;
    private LinearLayout Six;
    private ImageView I1;
    private ImageView I2;
    private ImageView I3;
    private ImageView I4;
    private ImageView I5;
    private ImageView I6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);
        Bundle arguments = getIntent().getExtras();
        Name = (TextView) findViewById(R.id.textView21);
        One = (LinearLayout) findViewById(R.id.first);
        Two = (LinearLayout) findViewById(R.id.second);
        Three = (LinearLayout) findViewById(R.id.therd);
        Fore = (LinearLayout) findViewById(R.id.foer);
        Five = (LinearLayout) findViewById(R.id.fith);
        Six = (LinearLayout) findViewById(R.id.eight);
        I1 = (ImageView) findViewById(R.id.imageView5);
        I2 = (ImageView) findViewById(R.id.imageView4);
        I3 = (ImageView) findViewById(R.id.imageView2);
        I4 = (ImageView) findViewById(R.id.imageView);
        I5 = (ImageView) findViewById(R.id.imageView3);
        I6 = (ImageView) findViewById(R.id.imageView7);
        Name.setText(arguments.get("key").toString());
        if (Integer.parseInt(arguments.get("coll").toString())>2){
            One.setVisibility(View.INVISIBLE);
            Three.setVisibility(View.INVISIBLE);
            Six.setVisibility(View.INVISIBLE);
        }
        if (Integer.parseInt(arguments.get("coll").toString())>3){
            One.setVisibility(View.INVISIBLE);
            Three.setVisibility(View.INVISIBLE);
            Six.setVisibility(View.INVISIBLE);
            Two.setVisibility(View.INVISIBLE);
            Fore.setVisibility(View.INVISIBLE);
        }
        if (Integer.parseInt(arguments.get("coll").toString())>4){
            One.setVisibility(View.INVISIBLE);
            Three.setVisibility(View.INVISIBLE);
            Six.setVisibility(View.INVISIBLE);
            Two.setVisibility(View.INVISIBLE);
            Fore.setVisibility(View.INVISIBLE);
            Five.setVisibility(View.INVISIBLE);
        }
        else {}
    }

    public void toNomer(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","??????????");
        i.putExtra("cost","????????: 1890 ??????.");
        i.putExtra("coll","?????????????????????? ????????: 2");
        i.putExtra("opis","???????????????????? ?????????? " +
                "???????????????? ?????? ???????????????????? ???? ?????????????????? ????????. ???? " +
                "???????????????????????? ?????????? ???????????????? ?????????????? 15 ???????????????????? " +
                "???????????? (?????????? ?????????????????? ???? ??????????????????). ?????? ???????????????????????? ?????????????? ?????????? " +
                "????????????????????????, ?????? ???????? ?????????????????????? ?????????????????? ???????????????? ???????? 1+1 ???????? " +
                "???????????????????????? ?? ?????????????????????? ??????????????. ???? ???????????????????????? ?? ???????????????? ?????????? ???????????? " +
                "?? ?????????????????????? ?????????? ?????????? ?????????????????????????? ???????????????????? ?? ???????????? ????????????????????????. " +
                "???????? ?????????? ???????????? ?? ?????????????????? ?????????????????????????? ????????, ?? ???????????????????? ???????? ???????????????? " +
                "???????????????? ???????? ???????????? ???? ????????. ?????? ???????????????? ?????????? ?????????????? ?? ????????????????????, ???????????????? " +
                "???? ???????????? ???????? ?????????? ?? ?????????????????????????? ?????????????????? ???????????????? ???????????????? " +
                "???????????? ?? ?????????? ??????????????????. ?? ?????????????????????? ?? ???????????? ???????????? ?????????????? ?????????????????????? " +
                "???????????????????????? ?????????? ????????????.");
        i.putExtra("image",R.drawable.volga);
        startActivity(i);
    }
    public void toNomer2(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","???????????????? ????????????");
        i.putExtra("cost","????????: 2590 ??????.");
        i.putExtra("coll","?????????????????????? ????????: 3");
        i.putExtra("opis","???????? ?????????????????????? ???????????? " +
                "???????????????? 3-?? ?????????????? ??????????. ???????????????? " +
                "?????????? ???????????????????????? ?????????? ???????? 2-???????????????? ?? ???????? " +
                "1-???????????????? ??????????????. ?????????????? ?????????????? ???? ?????????? ???????? " +
                "?????????????? ???? 2-?? ?????????????????? ????????????, ???????????? ???? ?????????????? " +
                "?????????? ?????????? ?????????? ?????????????????? ???????????? ?????? ???????????? ?????????? " +
                "????????????. ?????????? ?? ???????????? ???????????????? ???????? ?????????????? ?? ?????????????????? " +
                "??????????. ?? ?????????????? ?????????? ???????????? ?????????????????? ???????????? ?????????? " +
                "?????? ???????????????? ??????????, ???????????? ?? ???????????? ???????????? ??????????. " +
                "???????????????????? ???????? ?? ?????????????? ???????? ?????????????? ???????????????????? " +
                "?????????????? ????????, ?????? ?????????? ???????????????? ???? ?????????????????????? ?????? " +
                "?????????????????? ???????????? ?????????????? ?????????????????????? ????????????????. ?? ???????????? " +
                "???????? ???????????? ?? ?????????????????? ??????????????????????. ?????? ?????????????????????????? " +
                "?????? ?????????? ?????????? ?????????? ?????????????????????????????? ?????????? ????????????. " +
                "???????????????? ?????????? ?? ???????????? ?????????????? ???????????????????? Wi-Fi ?? " +
                "?????????????? ?????????????????? ???????????????? ??????????????. ?? ???????? ???????????????? " +
                "?????????? ???????????? ???????? ???????????????????? ????????????????, ?????????????????? ???? " +
                "?????????????? ?????? ?????????????? ????????????, ???????????????? ?? ??????????.");
        i.putExtra("image",R.drawable.molochniy_ostrov);
        startActivity(i);
    }
    public void toNomer3(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","????????");
        i.putExtra("cost","????????: 2890 ??????.");
        i.putExtra("coll","?????????????????????? ????????: 2");
        i.putExtra("opis","?????????? ???????????????????????? ?????????? ?????????????????? " +
                "???????????? ??????????????, ?? ?????????????? ???????? ?????? ?????????????????????? ?????? ????????????????????: " +
                "?????????????? ?????????????????????? ??????????????, ???????? ?? ???????????????????????? ?????????? ?????? " +
                "???????????????? ??????????, ?????????????? ??????????. ?? ???????????? ???????? ?????????????????? ???????????? " +
                "??????????????, ?????????????????????? ?? ????????????????. ?????????? ?? ???????????????? ???????? ???????????????????????????? " +
                "?????????????????? ?? ???????? 2-?? ???????????? ????????????????????????, ?? ?????????? ???????????? ?????????? " +
                "?????????????????? ??????????????. ???????????????????? ???????? ?? ?????????????? ???????? ?????????????? " +
                "???????????????????? ?????????????? ????????, ?????? ?????????? ???????????????? ???? ?????????????????????? " +
                "?????? ?????????????????? ???????????? ?????????????? ?????????????????????? ????????????????. ?????? ???????????? " +
                "?????????????????????????? ?????????????? ??????????????, ?????????????? ???????????? ???????????????????????? ?????? " +
                "?????????????????? ??????????????, ???????????????? ???????????? ?????? ???????????????????? ???????????? ???????????????? " +
                "???????? ?????????? ????????????. ?? ???????????? ???????? ???????????? ?? ?????????????????? ??????????????????????. " +
                "?????? ?????????????????????????? ?????? ?????????? ?????????? ?????????? ?????????????????????????????? ?????????? ????????????. " +
                "???????????????? ?????????? ?? ???????????? ?????????????? ???????????????????? Wi-Fi ?? ?????????????? ?????????????????? ???????????????? ??????????????.");
        i.putExtra("image",R.drawable.bress);
        startActivity(i);
    }
    public void toNomer4(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","?????????????????? ??????");
        i.putExtra("cost","????????: 2590 ??????.");
        i.putExtra("coll","?????????????????????? ????????: 3");
        i.putExtra("opis","??????????????, ???????????? ?????????? ???????????? ??????????, ???????????????? " +
                "25 ????. ??., ???????????????????????? ?????? ???????????????????? ???? 3-?? ??????????????. ?? ???????????? ????????" +
                " 1 ???????????????????????? ?? 1 ?????????????????????? ??????????????, ?????????????? ?????????? ????????????????????????????????" +
                " ?? ?? 3 ?????????????????? ???????????????? ??????????. ???? ???????????????????????? ?? ???????????????? ?????????? ????????????" +
                " ?? ?????????????????????? ?????????? ?????????? ?????????????????????????? ???????????????????? ?? ?????????????? ??????????????????????????." +
                " ???????? ?????????? ???????????? ?? ?????????????????? ?????????????????????????? ????????, ?? ???????????????????? ???????? ????????????????" +
                " ???????????????? ???????? ???????????????? ???????????? ???? ????????. ?? ???????????????? ???????????? ?????????????????? ??????????????????" +
                " ???????????? ?? ????????????????, ????????????, ?????????????? ???????????????? ?? ????????????????. ???????????????? ??????????????" +
                " ???????????????????? ??????????????????, ?????????????? ???????????????? ?????? ???????????????? ???????????? ?? ?????????? ??????????????????." +
                " ?????????? ?????????????????????? ???????? ????????????, ?????????????????????? ?? ???????????? ???????????? ?????????? ?????????????????????? ???????????????????????? ?????????? ????????????.");
        i.putExtra("image",R.drawable.lec);
        startActivity(i);
    }
    public void toNomer5(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","?????????????? ??????");
        i.putExtra("cost","????????: 3190 ??????.");
        i.putExtra("coll","?????????????????????? ????????: 4");
        i.putExtra("opis","?????????? ?????????????????? ???????????? ???????????????? ???????????????? ?????? ???????????????????? ???? " +
                "?????????? ????????. ?? ?????????????? ???? ?????????????????? ?????????????????????? ??????????????????, ???????????? ?????????? ?????????? ???????????????????? " +
                "??? ?????? ?????????????? ???????????????????? 30 ????. ??. ?????????? ?????????? ???????????? ?? ?????????????????? ?????????????????? ???? ?????????????? " +
                "?????????????????????? ?????????????? ?? ???????????????????????? ???? ???????????????????? ???????????????? ????????. ?????????? ?????????????????????????? 2 " +
                "???????????????????????? ?????????? ?? ?????????????????????? ?????????????? ?????? ???????????????? ?????????????????????????????? ?????????????? ??????????????????. " +
                "?????? ???????? ???????????????????? ?????????????????? ?????????? ?? ???????????????????? ????????????, ?????????? ???? ???????????? ???????????? ?????????????? " +
                "?????????? ?????????????? ????????????????????????, ?????????? ?????? ???????????? ???????????????? ????????????????. ???? ?????????? ?????????????????????????? " +
                "???????????? ?? ????????????, ?????????????? ???????????????? ???????????????????????? ?????????????????? ??????????????. ?? ???????????? ???????????? ???? " +
                "?????????????????????????? ?????????????????? ???????? ?????? ??????????????, ???? ???? ?????????? ?????? ???????????????????? ?????????????????????????????? " +
                "?????????? ???????????? ???????????? ??????????. ?????? ???????????????? ?????????? ?? ?????????????? ???????? ?????????????????? ???????? ?? ?????????????????? " +
                "???????????????? ?? ?????????? ?? ??????????. ?? ???????????? ???????? ???????????? ???????????? ??????????????, ?????????????????????? ?? ????????????????.");
        i.putExtra("image",R.drawable.zol_rog);
        startActivity(i);
    }
    public void toNomer6(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","????????");
        i.putExtra("cost","????????: 1890 ??????.");
        i.putExtra("coll","?????????????????????? ????????: 2");
        i.putExtra("opis","?????????? ???????????????? ?????? ???????????????????? 2-?? ??????????????. ?????? ?????????? ???????????????????? " +
                "???? ?????????????????? ?????????????????? ?????? ???????????????????? ??? ?????????????? ???????????? ???????????????????? 15 ????.??. ?????????? ??????????????" +
                " ?? ???????????? ?????????????? ?????????????????? ???????????????? ???? ????????????. ?? ?????????????? ?????????????????????????? 2 ?????????????????? ??????????????," +
                " ?????????????? ?????????? ???????????????????????????????? ?? 1 2-???????????????? ?????? 2 ???????????????????????? ?????????? ?????? ????????????." +
                " ?????? ???????????????? ?????????????????????? ?? ???????????? ???????? ???????????????????????? ?????????? ?????? ???????????????? ?????????????????????? " +
                "??????????????. ???????? ?????????? ???????????? ?? ?????????????????? ???????? ?? ?????????? ???????????????????????????? ????????????????, ?? ??????????????????" +
                " ?????????????????????? ?????????? ???????????? ?????????? ?????????????????? ???????????????? ???????? ???????????????? ???????????? ???? ???????? ?????? ??????????." +
                " ?????? ???????????? ???????????? ?? ???????????? ???????????????????? ??????????????????, ?? ?????????? ???????????????? ???????????????????? Wi-Fi. ??" +
                " ?????????????????????? ?? ???????????? ???????????? ?????????????? ?????????????????????? ???????????????????????? ?????????? ????????????.");
        i.putExtra("image",R.drawable.jazz);
        startActivity(i);
    }

    public void Back(View view) {
        finish();
    }
}