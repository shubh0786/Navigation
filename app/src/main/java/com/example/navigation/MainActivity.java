package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        move=findViewById(R.id.btnac1);
        move=findViewById(R.id.btnac3);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent( MainActivity.this,MainActivity2.class );
                //Passing Data
                Intent intent2= new Intent( MainActivity.this,MainAc3.class );

                startActivity(intent);
                startActivity(intent2);
            }
        });



    }
}