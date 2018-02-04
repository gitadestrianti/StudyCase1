package com.gides.dariinternet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** YANG RAFTI final int hargaNasiAbnormal = 30000;
         final int hargaNasiEatbus = 50000;*/

        //DEKLARASI
        final EditText etNamaMakan = (EditText) findViewById(R.id.et_data1);//NAMA MAKANAN(NASI UDUK)
        final EditText etPorsiMakan = (EditText) findViewById(R.id.et_data2);//PORSI MAKANAN
        final Button btnEatbus = (Button) findViewById(R.id.bt_submit);//eatbus
        final Button btnAbnormal = (Button) findViewById(R.id.bt_submitintent);//abnormal

        btnEatbus.setOnClickListener(new View.OnClickListener() {//submit/eatbus

            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                String tempatMakan = btnEatbus.getText().toString();
                pindah.putExtra("makanan", etNamaMakan.getText().toString());
                pindah.putExtra("tempat", tempatMakan);
                pindah.putExtra("porsi", etPorsiMakan.getText().toString());
                startActivity(pindah);

            }
        });

        btnAbnormal.setOnClickListener(new View.OnClickListener() {//submit/eatbus

            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                String tempatMakan = btnAbnormal.getText().toString();
                pindah.putExtra("makanan", etNamaMakan.getText().toString());
                pindah.putExtra("tempat", tempatMakan);
                pindah.putExtra("porsi", etPorsiMakan.getText().toString());
                startActivity(pindah);

            }
        });

    }

}