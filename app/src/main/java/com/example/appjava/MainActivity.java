package com.example.appjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void submit(View view){
        TextView firstName = (findViewById(R.id.textFirstName));
        TextView lastName = (findViewById(R.id.textLastName));
        TextView email = (findViewById(R.id.textEmail));

        EditText editFirstName = findViewById(R.id.editFirstName);
        EditText editLastName = findViewById(R.id.editLastName);
        EditText editEmail = findViewById(R.id.editEmail);

        firstName.setText(editFirstName.getText().toString());
        lastName.setText(editLastName.getText().toString());
        email.setText(editEmail.getText().toString());
    }
}