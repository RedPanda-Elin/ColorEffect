package com.example.redpanda.coloreffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textview_description);
        Button button = (Button) findViewById(R.id.button_show_description);
        button.setOnClickListener(onClickListener);
        spinner = (Spinner) findViewById(R.id.spinner_for_colors);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.button_show_description) {
                String result = ColorSpec.getEffect(MainActivity.this,
                        spinner.getSelectedItemPosition());
                textView.setText(result);
            }

        }
    };
}
