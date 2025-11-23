package com.example.a3e_tibor_milosavljevic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button zbrojibutton = (Button) findViewById(R.id.zbrojibutton);
        Button mnozibutton = (Button) findViewById(R.id.mnozibutton);
        Button dijelibutton = (Button) findViewById(R.id.dijelibutton);
        Button oduzmibutton = (Button) findViewById(R.id.oduzmibutton);

        zbrojibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText prvibrojeditText = (EditText) findViewById(R.id.prvibrojeditText);
                EditText drugibrojeditText = (EditText) findViewById(R.id.drugibrojeditText);
                TextView rezultattextView = (TextView) findViewById(R.id.rezultattextView);

                int broj1 = Integer.parseInt(prvibrojeditText.getText().toString());
                int broj2 = Integer.parseInt(drugibrojeditText.getText().toString());

                int rezultat = broj1 + broj2;
                rezultattextView.setText(rezultat + "");
            }
        });

        mnozibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText prvibrojeditText = (EditText) findViewById(R.id.prvibrojeditText);
                EditText drugibrojeditText = (EditText) findViewById(R.id.drugibrojeditText);
                TextView rezultattextView = (TextView) findViewById(R.id.rezultattextView);

                int broj1 = Integer.parseInt(prvibrojeditText.getText().toString());
                int broj2 = Integer.parseInt(drugibrojeditText.getText().toString());

                int rezultat = broj1 * broj2;
                rezultattextView.setText(rezultat + "");
            }
        });

        dijelibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText prvibrojeditText = (EditText) findViewById(R.id.prvibrojeditText);
                EditText drugibrojeditText = (EditText) findViewById(R.id.drugibrojeditText);
                TextView rezultattextView = (TextView) findViewById(R.id.rezultattextView);

                int broj1 = Integer.parseInt(prvibrojeditText.getText().toString());
                int broj2 = Integer.parseInt(drugibrojeditText.getText().toString());

                int rezultat = broj1 / broj2;
                rezultattextView.setText(rezultat + "");
            }
        });

        oduzmibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText prvibrojeditText = (EditText) findViewById(R.id.prvibrojeditText);
                EditText drugibrojeditText = (EditText) findViewById(R.id.drugibrojeditText);
                TextView rezultattextView = (TextView) findViewById(R.id.rezultattextView);

                int broj1 = Integer.parseInt(prvibrojeditText.getText().toString());
                int broj2 = Integer.parseInt(drugibrojeditText.getText().toString());

                int rezultat = broj1 - broj2;
                rezultattextView.setText(rezultat + "");
            }
        });
    }
}