package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewSinhVien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewSinhVien = (ListView) findViewById(R.id.listViewSinhVien);

        ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
        dsSinhVien.add(new SinhVien("Ngo Viet Quang", 875684));
        dsSinhVien.add(new SinhVien("Tran VaN hieu", 8785));
        dsSinhVien.add(new SinhVien("Ngo Huy", 875684));
        dsSinhVien.add(new SinhVien("Tran Long", 8785));
        dsSinhVien.add(new SinhVien("Ngo LAn", 875684));
        dsSinhVien.add(new SinhVien("Tran Tien", 8785));

        sinhVienAdapter adapter = new sinhVienAdapter(MainActivity.this, R.layout.activity_sv_item, dsSinhVien);
        listViewSinhVien.setAdapter(adapter);
    }
}