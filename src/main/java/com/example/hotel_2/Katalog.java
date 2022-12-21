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
        i.putExtra("name","Волга");
        i.putExtra("cost","Цена: 1890 руб.");
        i.putExtra("coll","Колличество мест: 2");
        i.putExtra("opis","Компактный номер " +
                "подойдёт для проживания на небольшой срок. Из " +
                "особенностей можно выделить площадь 15 квадратных " +
                "метров (самый маленький из имеющихся). Две односпальных кровати могут " +
                "раздвигаться, что даёт возможность раскладки спальных мест 1+1 либо " +
                "превратиться в двуспальную кровать. Мы позаботились о комфорте наших гостей " +
                "и оборудовали номер двумя прикроватными тумбочками и ночным светильником. " +
                "Вещи можно убрать в небольшой двустворчатый шкаф, а письменный стол позволит " +
                "работать даже далеко от дома. Над кроватью висит картина с парусником, плывущим " +
                "по бурной реке Волге а установленный телевизор позволит скрасить " +
                "вечера в нашей гостинице. У проживающих в данном номере имеется возможность " +
                "пользоваться общей кухней.");
        i.putExtra("image",R.drawable.volga);
        startActivity(i);
    }
    public void toNomer2(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","Молочный остров");
        i.putExtra("cost","Цена: 2590 руб.");
        i.putExtra("coll","Колличество мест: 3");
        i.putExtra("opis","Рады представить вашему " +
                "вниманию 3-х местный номер. Спальные " +
                "места представляют собой одну 2-спальную и одну " +
                "1-спальную кровати. Большая кровать на самом деле " +
                "состоит из 2-х составных частей, каждая из которых " +
                "также может стать отдельным местом для отдыха наших " +
                "гостей. Рядом с каждой кроватью есть розетки и небольшие " +
                "тумбы. В большом шкафу гостям наверняка хватит места " +
                "для хранения сумок, одежды и других личных вещей. " +
                "Письменный стол и офисный стул создают комфортную " +
                "рабочую зону, где можно работать за компьютером или " +
                "выполнять другие офисные обязанности удаленно. В номере " +
                "есть чайник и небольшой холодильник. Для приготовления " +
                "еды гости отеля могут воспользоваться общей кухней. " +
                "Скрасить досуг в номере помогут бесплатный Wi-Fi и " +
                "плоский телевизор напротив кровати. В зоне коридора " +
                "перед дверью есть компактная прихожая, состоящая из " +
                "вешалки для верхней одежды, скамейки и тумбы.");
        i.putExtra("image",R.drawable.molochniy_ostrov);
        startActivity(i);
    }
    public void toNomer3(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","Бриз");
        i.putExtra("cost","Цена: 2890 руб.");
        i.putExtra("coll","Колличество мест: 2");
        i.putExtra("opis","Номер представляет собой небольшую " +
                "уютную комнату, в которой есть все необходимое для проживания: " +
                "большая двуспальная кровать, шкаф и прикроватные тумбы для " +
                "хранения вещей, рабочее место. В номере есть отдельная ванная " +
                "комната, совмещенная с санузлом. Рядом с кроватью есть дополнительное " +
                "освещение в виде 2-х ночных светильников, с обеих сторон также " +
                "размещены розетки. Письменный стол и офисный стул создают " +
                "комфортную рабочую зону, где можно работать за компьютером " +
                "или выполнять другие офисные обязанности удаленно. Над столом " +
                "располагается большое зеркало, которое удобно использовать для " +
                "нанесения макияжа, примерки одежды или оценивания своего внешнего " +
                "вида перед уходом. В номере есть чайник и небольшой холодильник. " +
                "Для приготовления еды гости отеля могут воспользоваться общей кухней. " +
                "Скрасить досуг в номере помогут бесплатный Wi-Fi и плоский телевизор напротив кровати.");
        i.putExtra("image",R.drawable.bress);
        startActivity(i);
    }
    public void toNomer4(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","Сибирский лес");
        i.putExtra("cost","Цена: 2590 руб.");
        i.putExtra("coll","Колличество мест: 3");
        i.putExtra("opis","Светлый, уютный номер нашего отеля, площадью " +
                "25 кв. м., предназначен для проживания до 3-х человек. В номере есть" +
                " 1 односпальная и 1 двуспальная кровать, которые можно трансформировать" +
                " и в 3 отдельных спальных места. Мы позаботились о комфорте наших гостей" +
                " и оборудовали номер двумя прикроватными тумбочками и ночными светильниками." +
                " Вещи можно убрать в небольшой двустворчатый шкаф, а письменный стол позволит" +
                " работать даже находясь далеко от дома. В прихожей гостей встречает небольшая" +
                " секция с вешалкой, тумбой, удобным сидением и зеркалом. Напротив кровати" +
                " установлен телевизор, который позволит вам скрасить вечера в нашей гостинице." +
                " Чтобы приготовить себе поесть, проживающие в данном номере имеют возможность пользоваться общей кухней.");
        i.putExtra("image",R.drawable.lec);
        startActivity(i);
    }
    public void toNomer5(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","Золотой рог");
        i.putExtra("cost","Цена: 3190 руб.");
        i.putExtra("coll","Колличество мест: 4");
        i.putExtra("opis","Номер категории «Люкс» идеально подойдет для проживания на " +
                "любой срок. В отличие от вариантов стандартной категории, данный номер более просторный " +
                "– его площадь составляет 30 кв. м. Здесь гости смогут с комфортом отдохнуть на большой " +
                "двухместной кровати и расслабиться за просмотром любимого кино. Рядом располагаются 2 " +
                "прикроватные тумбы с настольными лампами для создания дополнительного мягкого освещения. " +
                "Еще один светильник находится рядом с письменным столом, чтобы вы всегда смогли уделить " +
                "время рабочим обязанностям, учебе или другим полезным занятиям. На столе располагается " +
                "чайник и кружки, которые позволят организовать небольшой перекус. В данном номере не " +
                "предусмотрена отдельная зона для готовки, но мы можем вам предложить воспользоваться " +
                "общей кухней нашего отеля. Для хранения вещей в комнате есть распашной шкаф и небольшая " +
                "прихожая у входа в номер. В номере есть личная ванная комната, совмещенная с санузлом.");
        i.putExtra("image",R.drawable.zol_rog);
        startActivity(i);
    }
    public void toNomer6(View view) {
        Intent i = new Intent(this,Nomer.class);
        i.putExtra("key",Name.getText().toString());
        i.putExtra("name","Блюз");
        i.putExtra("cost","Цена: 1890 руб.");
        i.putExtra("coll","Колличество мест: 2");
        i.putExtra("opis","Номер подойдет для проживания 2-х человек. Это самый компактный " +
                "из имеющихся вариантов для размещения – площадь номера составляет 15 кв.м. Общий санузел" +
                " и ванная комната находятся недалеко от номера. В комнате располагаются 2 составные кровати," +
                " которые можно трансформировать в 1 2-спальное или 2 односпальных места для отдыха." +
                " Для удобства проживающий в номере есть прикроватная тумба для хранения необходимых " +
                "мелочей. Вещи можно убрать в небольшой шкаф с тремя вместительными секциями, а благодаря" +
                " письменному столу гостям будет комфортно работать даже находясь далеко от дома или офиса." +
                " Для досуга гостей в номере установлен телевизор, а также работает бесплатный Wi-Fi. У" +
                " проживающих в данном номере имеется возможность пользоваться общей кухней.");
        i.putExtra("image",R.drawable.jazz);
        startActivity(i);
    }

    public void Back(View view) {
        finish();
    }
}