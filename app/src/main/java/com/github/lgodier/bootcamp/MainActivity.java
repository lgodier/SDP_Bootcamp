package com.github.lgodier.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAnActivity(View view) {
        Intent intent = new Intent(view.getContext(), activity_greeting.class);
        EditText mEdit = (EditText) findViewById(R.id.mainName);
        intent.putExtra("mainName", mEdit.getText());
        view.getContext().startActivity(intent);
    }
}