package com.leoyats.android.contextmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    final int MENU_COLOR_RED = 1;
//    final int MENU_COLOR_GREEN = 2;
//    final int MENU_COLOR_BLUE = 3;
//
//    final int MENU_SIZE_22 = 4;
//    final int MENU_SIZE_26 = 5;
//    final int MENU_SIZE_30 = 6;

    TextView textColor;
    TextView textSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        textColor = findViewById(R.id.tvColor);
        textSize = findViewById(R.id.tvSize);

        registerForContextMenu(textColor);
        registerForContextMenu(textSize);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        switch (v.getId()) {
            case R.id.tvColor:
                getMenuInflater().inflate(R.menu.menu_color, menu);
//                menu.add(0, MENU_COLOR_RED, 0, "Red");
//                menu.add(0, MENU_COLOR_GREEN, 0, "Green");
//                menu.add(0, MENU_COLOR_BLUE, 0, "Blue");
                break;
            case R.id.tvSize:
                getMenuInflater().inflate(R.menu.menu_size, menu);
//                menu.add(0, MENU_SIZE_22, 0, "22");
//                menu.add(0, MENU_SIZE_26, 0, "26");
//                menu.add(0, MENU_SIZE_30, 0, "30");
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
      // TODO Auto-generated method stub
        switch (item.getItemId()) {
      // пункты меню для tvColor
        case R.id.MENU_COLOR_RED:
          textColor.setTextColor(Color.RED);
          textColor.setText("Text color = red");
          break;
        case R.id.MENU_COLOR_GREEN:
            textColor.setTextColor(Color.GREEN);
            textColor.setText("Text color = green");
          break;
        case R.id.MENU_COLOR_BLUE:
            textColor.setTextColor(Color.BLUE);
            textColor.setText("Text color = blue");
          break;
        // пункты меню для tvSize
        case R.id.MENU_SIZE_22:
            textColor.setTextSize(22);
            textColor.setText("Text size = 22");
          break;
        case R.id.MENU_SIZE_26:
          textSize.setTextSize(26);
            textSize.setText("Text size = 26");
          break;
        case R.id.MENU_SIZE_30:
            textSize.setTextSize(30);
            textSize.setText("Text size = 30");
          break;
          }
          return super.onContextItemSelected(item);
    }
}
