package com.example.admin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.model.Employee;
import com.example.admin.noactionbar.R;

import java.util.ArrayList;

/**
 * Created by Admin on 9/22/2017.
 */

public class FlipperAdapter extends BaseAdapter {


    private Context context;
    private int resources;
    private ArrayList<Employee> nhanVien;

    public FlipperAdapter(Context context, int resources, ArrayList<Employee> nhanVien) {
        this.context = context;
        this.resources = resources;
        this.nhanVien = nhanVien;
    }

    @Override
    public int getCount() {
        return nhanVien.size();
    }

    @Override
    public Object getItem(int i) {
        return nhanVien.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = (LayoutInflater.from(context)).inflate(resources, null);

        ImageView img_icon = view.findViewById(R.id.img_icon);
        TextView txt_name = view.findViewById(R.id.txt_name);

        Employee nhanvien = (Employee) getItem(i);

        img_icon.setImageResource(nhanvien.getIcon());
        txt_name.setText(nhanvien.getName());

        return view;
    }
}
