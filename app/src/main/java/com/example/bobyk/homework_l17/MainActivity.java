package com.example.bobyk.homework_l17;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by bobyk on 22/07/15.
 */
public class MainActivity extends Activity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
    }
}
