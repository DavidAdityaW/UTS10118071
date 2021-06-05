package com.example.uts10118071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/*
    Dikerjakan pada tanggal : 05 Juni 2021
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class InputActivity extends AppCompatActivity {

    private EditText etNik, etNama, etTgl;
    private RadioGroup rgJk;
    private RadioButton rbLakilaki, rbPerempuan;
    private RadioGroup rgHubungan;
    private RadioButton rbOrangtua, rbSuamiistri, rbAnak, rbKerabat;
    private Button btnNext;
    private String jk;
    private String hubungan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        etNik = findViewById(R.id.et_nik);
        etNama = findViewById(R.id.et_nama);
        etTgl = findViewById(R.id.et_tgl);
        rgJk = findViewById(R.id.rg_jk);
        rbLakilaki = findViewById(R.id.rb_lakilaki);
        rbPerempuan = findViewById(R.id.rb_perempuan);
        rgHubungan = findViewById(R.id.rg_hubungan);
        rbOrangtua = findViewById(R.id.rb_orangtua);
        rbSuamiistri = findViewById(R.id.rb_suamiistri);
        rbAnak = findViewById(R.id.rb_anak);
        rbKerabat = findViewById(R.id.rb_kerabat);
        btnNext = findViewById(R.id.btn_next);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parsingData();
            }
        });
    }

    public void parsingData() {
        int selectedIdJk = rgJk.getCheckedRadioButtonId();
        switch (selectedIdJk) {
            case  R.id.rb_lakilaki :
                jk = "Laki-laki";
                break;
            case  R.id.rb_perempuan :
                jk = "Perempuan";
                break;
        }
        int selectedIdHub = rgHubungan.getCheckedRadioButtonId();
        switch (selectedIdHub) {
            case  R.id.rb_orangtua :
                hubungan = "Orangtua";
                break;
            case  R.id.rb_suamiistri :
                hubungan = "Sumai/Istri";
                break;
            case  R.id.rb_anak :
                hubungan = "Anak";
                break;
            case  R.id.rb_kerabat :
                hubungan = "Kerabat Lainnya";
                break;
        }

        // parsing data
        Intent i = new Intent(InputActivity.this, MainActivity.class);
        i.putExtra("nik", etNik.getText().toString());
        i.putExtra("nama", etNama.getText().toString());
        i.putExtra("tgl", etTgl.getText().toString());
        i.putExtra("jk", jk);
        i.putExtra("hubungan", hubungan);
        startActivity(i);
        finish();
    }
}