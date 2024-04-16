<p align="center">
<h1 align='center'>Season 2 / Section 1 / HomeWork 214.1 Solution</h1>
<h3 align='center'>
   Visit my youtube channel <a href="https://www.youtube.com/@CodeCraftArena">CodeCraft Arena</a>
</h3>
</p>

## Step 1: Here is `activity_main.xml` code:
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textViewDescription"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="16dp"
        android:text="Enter a number to check if it is divisible by 5 and 11."
        android:textSize="16sp" />

    <EditText
        android:id="@+id/editTextNumber"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter a number"
        android:inputType="number" />

    <Button
        android:id="@+id/buttonCheck"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="16dp"
        android:text="Check Divisibility" />

    <TextView
        android:id="@+id/textViewResult"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="16dp" />

</LinearLayout>
```
## Step 2: Here is `MainActivity.java` code:
```java
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
```
## Authors
**MD YEAMIN** - *Android Software Developer* - <a href="https://github.com/i-rin-eam">MD YEAMIN</a> - *Learn with Ease*
<h1 align="center">Thank You ❤️</h1>
