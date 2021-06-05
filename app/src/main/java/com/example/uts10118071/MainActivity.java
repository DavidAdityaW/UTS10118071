package com.example.uts10118071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
    Dikerjakan pada tanggal : 05 Juni 2021
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class MainActivity extends AppCompatActivity {

    private EditText etNik, etNama, etTgl, etJk, etHubungan;
    Button btnUbah, btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNik = findViewById(R.id.et_nik);
        etNama = findViewById(R.id.et_nama);
        etTgl = findViewById(R.id.et_tgl);
        etJk = findViewById(R.id.et_jk);
        etHubungan = findViewById(R.id.et_hubungan);
        btnUbah = findViewById(R.id.btn_ubah);
        btnSimpan = findViewById(R.id.btn_simpan);

        // get data
        String nim = getIntent().getExtras().getString("nik");
        String nama = getIntent().getExtras().getString("nama");
        String tgl = getIntent().getExtras().getString("tgl");
        String jk = getIntent().getExtras().getString("jk");
        String hubungan = getIntent().getExtras().getString("hubungan");

        // set data
        etNik.setText(nim);
        etNama.setText(nama);
        etTgl.setText(tgl);
        etJk.setText(jk);
        etHubungan.setText(hubungan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog();
                dialog.show(getSupportFragmentManager(), "MyDialog");
            }
        });

    }
}
