package com.leoyats.android.onclickbuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button okBtn;
    Button canselBtn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.headertext);

        okBtn = findViewById(R.id.ok);
        canselBtn = findViewById(R.id.cansel);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("OK");
            }
        };

        okBtn.setOnClickListener(clickListener);
    }
}
