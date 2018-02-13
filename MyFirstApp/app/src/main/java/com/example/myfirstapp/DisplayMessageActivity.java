package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
TextView result;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // Get the Intent that started this activity and extract the string
        textView = findViewById(R.id.textView);
        result = findViewById(R.id.result);
        try {
            String message = getIntent().getStringExtra("EXTRA_MESSAGE");
            //Capture the layout's TextView and set the string as its text

            textView.setText(message);
        } catch(Exception e){
            textView.setText("calculator mode");
        }
        try {

            int num1 = Integer.parseInt(getIntent().getStringExtra("num1"));
            int num2 = Integer.parseInt(getIntent().getStringExtra("num2"));
            String btnType = getIntent().getStringExtra("btn");
            if (btnType.equals("+")) {
                result.setText(num1 + "+" + num2 + "=" + (num1 + num2));
            }
            if (btnType.equals("-")) {
                result.setText(num1 + "-" + num2 + "=" + (num1 - num2));
            }
            if (btnType.equals("*")) {
                result.setText(num1 + "*" + num2 + "=" + (num1 * num2));
            }
        }catch(Exception e){
            result.setText("send message mode");
        }
    }
    public void goBack(View view){
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
    }
}
