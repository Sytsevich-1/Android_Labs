package com.example.lr2_sytsevich_081071;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ExaminerActivity extends AppCompatActivity {
    private EditText examinerEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examiner);

        examinerEditText = findViewById(R.id.examinerEditText);
        Button nextButton = findViewById(R.id.nextButton);

        final String examName = getIntent().getStringExtra("examName");

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String examiner = examinerEditText.getText().toString();
                Intent intent = new Intent(ExaminerActivity.this, DateActivity.class);
                intent.putExtra("examName", examName);
                intent.putExtra("examiner", examiner);
                startActivity(intent);
            }
        });
    }
}