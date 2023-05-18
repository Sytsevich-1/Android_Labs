package com.example.lr2_sytsevich_081071;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {
    private TextView examNameTextView;
    private TextView examinerTextView;
    private TextView examDateTextView;
    // Добавьте остальные поля UI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        examNameTextView = findViewById(R.id.examNameTextView);
        examinerTextView = findViewById(R.id.examinerTextView);
        examDateTextView = findViewById(R.id.examDateTextView);
        // Инициализируйте остальные поля UI

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String examName = extras.getString("examName");
            String examiner = extras.getString("examiner");
            String examDate = extras.getString("examDate");

            examNameTextView.setText(examName);
            examinerTextView.setText(examiner);
            examDateTextView.setText(examDate);
            // Задайте значения остальным полям UI
        }
    }
}
