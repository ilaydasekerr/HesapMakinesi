package com.example.hesapmakinesidogru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText editText1;
    TextView textView1,textViewsonuc;

    EditText editTextTexts1, editTextTexts2,editTextTextislem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,editText1.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void init()
    {
        textView1=(TextView) findViewById(R.id.editText1);
        textViewsonuc=(TextView) findViewById(R.id.textViewsonuc);
        editText1=(EditText) findViewById(R.id.editText1);
        button1=(Button) findViewById(R.id.button1);
        editTextTexts2=(EditText) findViewById(R.id.editTextTexts2);
        editTextTexts1=(EditText) findViewById(R.id.editTextTexts1);
        editTextTextislem=(EditText) findViewById(R.id.editTextTextislem);
    }

    public void islem_yap(View view) {
        //Toast.makeText(this,"İşlem Yapılıyor", Toast.LENGTH_LONG).show();

       /* int s1=Integer.parseInt(editTextTexts1.getText().toString());
        int s2=Integer.parseInt(editTextTexts2.getText().toString());
        int sonuc=s1+s2;
        textViewsonuc.setText("İşlem Sonucu: " +sonuc); */

        double s1=0,s2=0,sonuc=0;
        String islem="";

        s1=Double.parseDouble(editTextTexts1.getText().toString());
        s2=Double.parseDouble(editTextTexts2.getText().toString());
        islem=editTextTextislem.getText().toString();

        switch (islem)
        {
            case "+":sonuc=s1+s2;break;
            case "-":sonuc=s1-s2;break;
            case "*":sonuc=s1*s2;break;
            case "/":sonuc=s1/s2;break;
            default:sonuc=0;editTextTextislem.setText("");
            Toast.makeText(this,"Hatalı İşlem Tipi",Toast.LENGTH_SHORT).show();break;
        }

        textViewsonuc.setText("İşlem Sonucu: "+sonuc);
    }
}