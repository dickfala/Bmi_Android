package com.example.yuanyuchang.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();

        setContentView(R.layout.activity_result);

//        float bmi = getIntent().getFloatExtra("EXTRA_BMI",0);
        Bundle bundle = getIntent().getExtras();
        float bmi = bundle.getFloat("EXTRA_BMI",0);
        String name = bundle.getString("EXTRA_NAME","");

        TextView tvBMI = findViewById(R.id.tv_bmi);
//        tvBMI.setText(bmi+"");
        tvBMI.setText(String.valueOf(bmi));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show();
    }
}
