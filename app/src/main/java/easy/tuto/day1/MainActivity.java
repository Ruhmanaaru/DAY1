package easy.tuto.day1;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvObject;
    Button buttonObj;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvObject = findViewById(R.id.textViewDesign);
//        tvObject.setText("It is changed at the start");
        buttonObj = findViewById(R.id.button);
        buttonObj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvObject.setText("Button is clicked");
            }
        });







    }
}