package ru.startandroid.p0261;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by magnum on 30.01.2018.
 */

public class ActivityTime extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvTime = findViewById(R.id.tvTime);
        tvTime.setText(time);
    }
}
