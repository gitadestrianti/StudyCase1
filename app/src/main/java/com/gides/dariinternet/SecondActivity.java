package com.gides.dariinternet;

/**
 * Created by ASUS on 03/02/2018.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;

public class SecondActivity extends AppCompatActivity {
    //DEKLARASI
    int uangOsas = 65500;
    int hargaMakanan, total, hargaTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView namaMakanan = (TextView)findViewById(R.id.tv_data1);
        TextView jumlahPorsi = (TextView)findViewById(R.id.tv_data2);
        TextView namaLokasi = (TextView) findViewById(R.id.tv_judul);
        TextView hasil = (TextView) findViewById(R.id.tv_harga);


        //Untuk dapat intent dari layout 1
        Intent i = getIntent();

        String Makanan = i.getStringExtra("makanan");
        String Lokasi = i.getStringExtra("tempat");
        String Porsi = i.getStringExtra("porsi");


        namaMakanan.setText(Makanan);
        jumlahPorsi.setText(Porsi);
        namaLokasi.setText(Lokasi);



        switch (Lokasi){
            case "Eatbus":
                hargaMakanan = 50000;
                break;
            case "Abnormal":
                hargaMakanan = 30000;
                break;
        }
        total = parseInt(Porsi) * hargaMakanan;
        String hargaTotal = Integer.toString(total);

        if(uangOsas<total){

            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this,"Jangan disini makan malaanya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
        }else{
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this,"Disini aja makan malamnya",Toast.LENGTH_SHORT).show();
        }
    }
}
