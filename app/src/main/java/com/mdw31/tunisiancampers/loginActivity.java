package com.mdw31.tunisiancampers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        //bouton pour aler vers la liste des choix
        Button btn2 = findViewById(R.id.button3);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(getApplicationContext(),ChoiseActivity.class);
                startActivity(act);

            }
        });

        //bouton pour aler crée un compte
        Button btn3 = findViewById(R.id.button6);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent act = new Intent(getApplicationContext(),creatActivity.class);
                startActivity(act);

            }
        });

    }
}
