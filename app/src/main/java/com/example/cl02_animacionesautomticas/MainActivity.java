package com.example.cl02_animacionesautomticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = findViewById(R.id.textViewInformacion);
    }

    public void cambiarVisibilidad(View view) {
        Log.i("MainActivity/cambiarVisibilidad", "si entró");
        if (tvInfo.getVisibility() == View.VISIBLE){
            Log.i("MainActivity/cambiarVisibilidad", "estaba visible");
            tvInfo.setVisibility(View.GONE);
        } else {
            Log.i("MainActivity/cambiarVisibilidad", "no estaba visible");
            tvInfo.setVisibility(View.VISIBLE);
        }
    }
}