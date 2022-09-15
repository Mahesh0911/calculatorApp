package com.example.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText editText2;
    public TextView textView;
    private Button btn;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextNumber);
        editText2=findViewById(R.id.editTextNumber2);
        btn=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        textView=findViewById(R.id.textView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
            int add=Integer.parseInt(editText.getText().toString()) +Integer.parseInt(editText2.getText().toString());
                textView.setText("Addition is : \n"+add);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double div=Float.parseFloat(editText.getText().toString()) / Float.parseFloat(editText2.getText().toString());
                textView.setText("Division is : \n"+div);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mul=Integer.parseInt(editText.getText().toString()) * Integer.parseInt(editText2.getText().toString());
                textView.setText("Multiplication is : \n"+mul);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sub=Integer.parseInt(editText.getText().toString()) -Integer.parseInt(editText2.getText().toString());
                textView.setText("Subtraction is : \n"+sub);
            }
        });
    }
}