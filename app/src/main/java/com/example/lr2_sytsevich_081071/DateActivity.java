package com.example.lr2_sytsevich_081071;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

public class DateActivity extends AppCompatActivity {
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        datePicker = findViewById(R.id.datePicker);
        Button nextButton = findViewById(R.id.nextButton);

        final String examName = getIntent().getStringExtra("examName");
        final String examiner = getIntent().getStringExtra("examiner");

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1;
                int year = datePicker.getYear();

                String examDate = day + "/" + month + "/" + year;

                Intent intent = new Intent(DateActivity.this, SummaryActivity.class);
                intent.putExtra("examName", examName);
                intent.putExtra("examiner", examiner);
                intent.putExtra("examDate", examDate);
                startActivity(intent);
            }
        });
    }
}

