package com.example.tugas5kevin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
EditText inputnik;
EditText inputname;
EditText tlahir;
EditText tanggal;
EditText kota;
EditText kec;
EditText alamat;
RadioGroup rg1;
RadioGroup rg2;
RadioGroup rg3;
RadioButton rb1;
RadioButton rb2;
RadioButton rb3;
RadioButton rb4;
RadioButton rb5;
RadioButton rb6;
RadioButton rb7;
RadioButton rb8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputnik = findViewById(R.id.inputnik);
        inputname = findViewById(R.id.inputname);
        tlahir = findViewById(R.id.tlahir);
        tanggal = findViewById(R.id.tanggal);
        kota = findViewById(R.id.kota);
        kec = findViewById(R.id.kec);
        alamat = findViewById(R.id.alamat);

        rg1 = findViewById(R.id.rg1);
        rg2 = findViewById(R.id.rg2);
        rg3 = findViewById(R.id.rg3);
    }

    public void senddata(View view) {
        int idradio = rg1.getCheckedRadioButtonId();
        rb2 = findViewById(idradio);

        int idradio2 = rg2.getCheckedRadioButtonId();
        rb4 = findViewById(idradio2);
        rb5 = findViewById(idradio2);
        rb6 = findViewById(idradio2);

        int idradio3 = rg3.getCheckedRadioButtonId();
        rb8 = findViewById(idradio3);

        Intent i1 = new Intent(this,HasilActivity.class);
        i1.putExtra("nik",inputnik.getText().toString());
        i1.putExtra("name",inputname.getText().toString());
        i1.putExtra("tempatlahir",tlahir.getText().toString());
        i1.putExtra("tanggal",tanggal.getText().toString());
        i1.putExtra("kota",kota.getText().toString());
        i1.putExtra("kecamatan",kec.getText().toString());
        i1.putExtra("Alamat",alamat.getText().toString());
        i1.putExtra ("Jeniskelamin",rb2.getText().toString());
        i1.putExtra ("Pekerjaan",rb4.getText().toString());
        i1.putExtra ("Status",rb8.getText().toString());

        startActivity(i1);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
