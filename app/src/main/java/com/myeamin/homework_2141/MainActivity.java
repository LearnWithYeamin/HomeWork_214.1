package com.myeamin.homework_2141;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity class defines the behavior for an app that checks if a number
 * entered by the user is divisible by both 5 and 11.
 */
public class MainActivity extends AppCompatActivity {

    // UI components
    EditText editTextNumber;
    Button buttonCheck;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the UI components
        editTextNumber = findViewById(R.id.editTextNumber);
        buttonCheck = findViewById(R.id.buttonCheck);
        textViewResult = findViewById(R.id.textViewResult);

        // Set a click listener on the check button
        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the user input as a trimmed string
                String numberString = editTextNumber.getText().toString().trim();

                // Check if the input string is empty
                if (numberString.isEmpty()) {
                    // If no input provided, display a request for input
                    textViewResult.setText("Please enter a number.");
                } else {
                    // Parse the input string to an integer
                    int number = Integer.parseInt(numberString);

                    // Determine if the number is divisible by both 5 and 11
                    if (number % 5 == 0 && number % 11 == 0) {
                        // If divisible by both 5 and 11
                        textViewResult.setText(numberString + " is divisible by 5 and 11.");
                    } else if (number % 5 == 0 && number % 11 != 0) {
                        // If only divisible by 5 and not divisible by 11
                        textViewResult.setText(numberString + " is divisible by 5, but not divisible by 11.");
                    } else if (number % 5 != 0 && number % 11 == 0) {
                        // If only divisible by 11 and not divisible by 5
                        textViewResult.setText(numberString + " is divisible 11, but not divisible by 5.");
                    } else {
                        // If not divisible by both 5 and 11
                        textViewResult.setText(numberString + " is not divisible by 5 and 11.");
                    }
                }
            }
        });
    }
}
