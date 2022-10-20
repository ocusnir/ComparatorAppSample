package com.example.comparatorappsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class DigitComparator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_comparator);

        Button button = findViewById(R.id.Compare_Button);
        final EditText first_number = findViewById(R.id.FirstNumber);
        final EditText second_number = findViewById(R.id.SecondNumber);
        final TextView answer = findViewById(R.id.answer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Integer arg1 = Integer.valueOf(first_number.getText().toString());
                    Integer arg2 = Integer.valueOf(second_number.getText().toString());

                    if (arg1 == arg2) {
                        answer.setText("Equal!");
                    } else {
                        answer.setText("Not equal!");
                    }
                }catch (NumberFormatException e){
                    answer.setText("Enter Number");
                }

            }
        });
    }


}