package com.example.appjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNama;
    EditText edtNama;
    Button input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNama = findViewById(R.id.tvNama);
        edtNama = findViewById(R.id.edtNama);
        input = findViewById(R.id.btnTampil);

    }
    public void submit(View view){
        tvNama.setText(edtNama.getText().toString());
    }
}