package com.mdw31.tunisiancampers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoiseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise);

        //bouton pour aler vers la liste des places a visiter
        Button btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(getApplicationContext(),placeActivity.class);
                startActivity(act);

            }
        });

        //bouton pour aler vers les materiel de camping
        Button btn1 = findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(getApplicationContext(),materielActivity.class);
                startActivity(act);

            }
        });

        //bouton pour aler vers les astuce des camping
        Button btn2 = findViewById(R.id.button5);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(getApplicationContext(),astuceActivity.class);
                startActivity(act);

            }
        });



    }
}
