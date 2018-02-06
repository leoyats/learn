package com.leoyats.android.logandmess;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;


    private static  final String TAG = "myLogs";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "найдем View елементы");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        Log.d(TAG,"присваиваем listener для кнопок");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "определение id кнопки, вызвавшей этот listener");
        switch (v.getId()) {
            case R.id.btnOk:
                Log.d(TAG, "нажата кнопка ок");
                tvOut.setText("Нажата кнопка ОК");
                break;
            case R.id.btnCancel:
                Log.d(TAG, "нажата кнопка cansel");
                tvOut.setText("Нажата кнопка Cancel");
                break;
        }
    }

}
