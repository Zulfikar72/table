package com.zulfi.tablegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt1;
    Button btn1,btn2;
    TextView txt2;
   // String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        txt2 = findViewById(R.id.txt2);
        btn1 = findViewById(R.id.btn1);
       btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer w=Integer.parseInt(edt1.getText().toString());
                StringBuilder ans=new StringBuilder();

                for (int i = 1; i <= 10; i++) {

                    ans.append(w + " * " + i + " \t=\t" + (w * i)+"\n");

                }
                txt2.setText(ans);

            }


        });


        }
    public void reset() {
        txt2.setText(" ");
//edt1.setText(" ");

    }



}

