package com.gleslie.buttons;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView changing_text;
    Button change_button;
    EditText text_to_change_to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        change_button = findViewById(R.id.change_button);
        changing_text = findViewById(R.id.changing_text);
        text_to_change_to = findViewById(R.id.text_to_change);

        change_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        changing_text.setText(text_to_change_to.getText());
    }
}