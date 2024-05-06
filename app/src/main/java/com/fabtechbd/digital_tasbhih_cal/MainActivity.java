package com.fabtechbd.digital_tasbhih_cal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int b=0;
    Button add,sub,clear;
    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear=findViewById(R.id.clear);
        add=findViewById(R.id.add);
        tx=findViewById(R.id.tx);
        sub=findViewById(R.id.sub);


        // Find the TextView
        TextView marqueeTextView = findViewById(R.id.marqueeTextView);
        // Enable the Marquee effect
        marqueeTextView.setText("SubhanAllah, Alhamdulillah, Allahu Akbar, La ilaha illallah, Astaghfirullah, La hawla wa la quwwata illa billah, SubhanAllahi wa bihamdihi, SubhanAllahi wa bihamdihi, SubhanAllahil-azim:");
        marqueeTextView.setSelected(true);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b =0;
                tx.setText(""+b);

                Toast.makeText(MainActivity.this, "Counter Reset", Toast.LENGTH_SHORT).show();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b>0){
                    b =b-1;
                    tx.setText(""+b);

                }
                if (b==0){
                    Toast.makeText(MainActivity.this, "counter = 0", Toast.LENGTH_SHORT).show();
                }

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b =b+1;
                tx.setText(""+b);
            }
        });




    }
}
