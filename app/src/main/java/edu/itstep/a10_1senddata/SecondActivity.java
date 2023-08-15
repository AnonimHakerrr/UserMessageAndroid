package edu.itstep.a10_1senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private Button btnOk;
    private EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnOk = findViewById(R.id.btnOk);
        etMessage = findViewById(R.id.etMessage);

        btnOk.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.putExtra("message", etMessage.getText().toString());
            setResult(Activity.RESULT_OK, intent);
            finish();
        });
    }
}