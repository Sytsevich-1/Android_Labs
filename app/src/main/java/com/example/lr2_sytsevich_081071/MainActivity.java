package com.example.lr2_sytsevich_081071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText examNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        examNameEditText = findViewById(R.id.examNameEditText);
        Button nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String examName = examNameEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, ExaminerActivity.class);
                intent.putExtra("examName", examName);
                startActivity(intent);
            }
        });
    }
}