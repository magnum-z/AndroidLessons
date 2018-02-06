package ru.startandroid.p0271;

/**
 * Created by magnum on 06.02.2018.
 */

import java.sql.Date;
import java.text.SimpleDateFormat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        // get Intent which revoke this Activity
        Intent intent = getIntent();
        // get action from intent
        String action = intent.getAction();

        String format = "";
        String textInfo = "";

        if (action.equals("ru.startandroid.intent.action.showtime")) {
            format = "HH:mm:ss";
            textInfo = "Time: ";
        }
        else if (action.equals("ru.startandroid.intent.action.showdate")) {
            format = "dd.MM.yyyy";
            textInfo = "Date: ";
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String datetime = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvDate = findViewById(R.id.tvInfo);
        tvDate.setText(textInfo + datetime);
    }
}