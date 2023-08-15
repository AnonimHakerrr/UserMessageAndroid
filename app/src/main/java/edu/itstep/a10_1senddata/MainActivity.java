package edu.itstep.a10_1senddata;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView tvFirstActivity;
    private Button btnViewPager;
    private ActivityResultLauncher<Intent> secondActivityLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    String message = data.getStringExtra("message");
                    tvFirstActivity.setText(message);
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFirstActivity = findViewById(R.id.tvFirstActivity);
        btnViewPager = findViewById(R.id.btnViewPager);

        tvFirstActivity.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondActivity.class);
            secondActivityLauncher.launch(intent);
        });

        btnViewPager.setOnClickListener(v -> {
           startActivity(new Intent(this, ViewPagerActivity.class));
        });
    }
}