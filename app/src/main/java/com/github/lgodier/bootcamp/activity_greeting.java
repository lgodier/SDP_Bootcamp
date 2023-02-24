package com.github.lgodier.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class activity_greeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            TextView mGreet = (TextView)findViewById(R.id.textView);
            mGreet.setText("Hello "+ extras.get("mainName"));
        }
    }


}