package com.example.tugas5kevin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txt1 = findViewById(R.id.hasilnik);
        txt2 = findViewById(R.id.hasilnama);
        txt3 = findViewById(R.id.hasiltempatlahir);
        txt4 = findViewById(R.id.hasiltanggallahir);
        txt5 = findViewById(R.id.hasilkota);
        txt6 = findViewById(R.id.hasilkecamatan);
        txt7 = findViewById(R.id.hasilalamat);
        txt8 = findViewById(R.id.hasiljk);
        txt9 = findViewById(R.id.hasilpekerjaan);
        txt10 = findViewById(R.id.hasilstatus);


        String nik = getIntent().getExtras().getString("nik");
        String nama = getIntent().getExtras().getString("name");
        String tempatlahir = getIntent().getExtras().getString("tempatlahir");
        String tanggal = getIntent().getExtras().getString("tanggal");
        String kota = getIntent().getExtras().getString("kota");
        String kecamatan = getIntent().getExtras().getString("kecamatan");
        String Alamat = getIntent().getExtras().getString("Alamat");
        String Jeniskelamin = getIntent().getExtras().getString("Jeniskelamin");
        String Pekerjaan = getIntent().getExtras().getString("Pekerjaan");
        String Status = getIntent().getExtras().getString("Status");

        txt1.setText("NIK : "+nik);
        txt2.setText("Nama  : "+nama);
        txt3.setText("Tempat Lahir : "+tempatlahir);
        txt4.setText("Tanggal Lahir : "+tanggal);
        txt5.setText("Kota : "+kota);
        txt6.setText("Kecamatan : "+kecamatan);
        txt7.setText("Detail Alamat : "+Alamat);
        txt8.setText("Jenis Kelamin : "+Jeniskelamin);
        txt9.setText("Pekerjaan : "+Pekerjaan);
        txt10.setText("Status : "+Status);






    }
}