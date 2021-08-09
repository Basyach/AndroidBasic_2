package com.dpi.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //deklarasi variable
    EditText input1,input2;
    Button btn_tambah,btn_kurang,btn_kali,btn_bagi,btn_bersihkan;
    TextView text_hasil2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText)findViewById(R.id.input1);
        input2 = (EditText)findViewById(R.id.input2);
        btn_tambah = (Button)findViewById(R.id.btn_tambah);
        btn_kurang = (Button)findViewById(R.id.btn_kurang);
        btn_kali = (Button)findViewById(R.id.btn_kali);
        btn_bagi = (Button)findViewById(R.id.btn_bagi);
        btn_bersihkan = (Button)findViewById(R.id.btn_bersihkan);
        text_hasil2 = (TextView)findViewById(R.id.text_hasil2);

        btn_tambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((input1.getText().length()>0) && (input2.getText().length()>0)){
                    double angka1 = Double.parseDouble(input1.getText().toString());
                    double angka2 = Double.parseDouble(input2.getText().toString());
                    double result = angka1 + angka2;
                    text_hasil2.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btn_kurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((input1.getText().length()>0) && (input2.getText().length()>0)){
                    double angka1 = Double.parseDouble(input1.getText().toString());
                    double angka2 = Double.parseDouble(input2.getText().toString());
                    double result = angka1 - angka2;
                    text_hasil2.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btn_kali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((input1.getText().length()>0) && (input2.getText().length()>0)){
                    double angka1 = Double.parseDouble(input1.getText().toString());
                    double angka2 = Double.parseDouble(input2.getText().toString());
                    double result = angka1 * angka2;
                    text_hasil2.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btn_bagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if((input1.getText().length()>0) && (input2.getText().length()>0)){
                    double angka1 = Double.parseDouble(input1.getText().toString());
                    double angka2 = Double.parseDouble(input2.getText().toString());
                    double result = angka1 / angka2;
                    text_hasil2.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btn_bersihkan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                input1.setText("");
                input2.setText("");
                text_hasil2.setText("0");
                input1.requestFocus();
            }
        });
    }
}