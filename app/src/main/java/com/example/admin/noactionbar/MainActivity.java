package com.example.admin.noactionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.Button;

import com.example.admin.adapter.FlipperAdapter;
import com.example.admin.model.Employee;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AdapterViewFlipper flipper;
    private FlipperAdapter adapter;
    private ArrayList<Employee> nhanVien;

    private Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipper = (AdapterViewFlipper) findViewById(R.id.flipper_view);
        btnStop = (Button) findViewById(R.id.btnStop);
        nhanVien = new ArrayList<>();
        nhanVien.add(new Employee("Tran Hoang An", R.drawable.an));
        nhanVien.add(new Employee("Le Cam", R.drawable.cam));
        adapter = new FlipperAdapter(MainActivity.this, R.layout.flipper_item, nhanVien);
        flipper.setAdapter(adapter);

        flipper.setAutoStart(true);
        flipper.setFlipInterval(2000);

        btnStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnStop:
                flipper.stopFlipping();
                break;

        }
    }
}
