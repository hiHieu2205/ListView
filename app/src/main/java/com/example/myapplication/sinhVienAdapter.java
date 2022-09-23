package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class sinhVienAdapter extends ArrayAdapter<SinhVien> {

    public sinhVienAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public sinhVienAdapter(@NonNull Context context, int resource, @NonNull List<SinhVien> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null){
            LayoutInflater vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_sv_item, null);

        }
        SinhVien sv = getItem(position);
        if(sv != null){
            TextView textViewHoten = (TextView) v.findViewById(R.id.textViewHoTen);
            textViewHoten.setText(sv.HoTen);
            TextView textViewSoDienThoai = (TextView) v.findViewById(R.id.textViewSoDienThoai);
            textViewSoDienThoai.setText(String.valueOf(sv.Sodt));
        }

        return v;
    }
}
