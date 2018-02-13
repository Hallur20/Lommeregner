package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    Button btnTypePlus;
    Button btnTypeMinus;
    Button btnTypeMultiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnTypePlus = findViewById(R.id.button2);
        btnTypeMinus = findViewById(R.id.button3);
        btnTypeMultiply = findViewById(R.id.button4);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
    }
    public void add(View view) {
        Intent intent = new Intent(getBaseContext(), DisplayMessageActivity.class);
        intent.putExtra("num1", num1.getText().toString());
        intent.putExtra("num2", num2.getText().toString());
        intent.putExtra("btn", btnTypePlus.getText().toString());
        startActivity(intent);
    }
    public void minus(View view){
        Intent intent = new Intent(getBaseContext(), DisplayMessageActivity.class);
        intent.putExtra("num1", num1.getText().toString());
        intent.putExtra("num2", num2.getText().toString());
        intent.putExtra("btn", btnTypeMinus.getText().toString());
        startActivity(intent);
    }
    public void multiply(View view){
        Intent intent = new Intent(getBaseContext(), DisplayMessageActivity.class);
        intent.putExtra("num1", num1.getText().toString());
        intent.putExtra("num2", num2.getText().toString());
        intent.putExtra("btn", btnTypeMultiply.getText().toString());
        startActivity(intent);
    }
}
