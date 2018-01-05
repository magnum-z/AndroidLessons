package ru.startandroid.p0081;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myText = findViewById(R.id.myText);
        myText.setText("Privet");

        Button  myBtn = findViewById(R.id.myBtn);
        myBtn.setText("My button");
        myBtn.setEnabled(false);

        CheckBox myCheckBox = findViewById(R.id.myCheckBox);
        myCheckBox.setChecked(true);

    }
}
