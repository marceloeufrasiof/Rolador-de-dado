package com.example.roladordedado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView dado;
    private int[] numerosdado = {
            R.drawable.diceum,
            R.drawable.dicedois,
            R.drawable.dicetres,
            R.drawable.dicequatro,
            R.drawable.dicecinco,
            R.drawable.diceseis
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dado = findViewById(R.id.dado);

        dado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numeroaleatorio = new Random().nextInt(numerosdado.length);
                dado.setImageResource(numerosdado[numeroaleatorio]);



            }
        });

    }
}
