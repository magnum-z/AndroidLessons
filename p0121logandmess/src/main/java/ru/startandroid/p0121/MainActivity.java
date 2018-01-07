package ru.startandroid.p0121;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "find View elements");
        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        Log.d(TAG, "assign Event handlers to buttons");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "define pressed button");
        switch (view.getId()) {
            case R.id.btnOk:
                Log.d(TAG, "btnOk is pressed");
                tvOut.setText("btnOk is pressed");
                Toast.makeText(this, "btnOk is pressed", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCancel:
                Log.d(TAG, "btnCancel is pressed");
                tvOut.setText("btnCancel is pressed");
                Toast.makeText(this, "btnCancel is pressed", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
