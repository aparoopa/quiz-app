package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button LoginBtn;
    private TextView Info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.qName);
        Password = (EditText)findViewById(R.id.qPassword);
        LoginBtn = (Button) findViewById(R.id.btnLogin);
        Info = (TextView)findViewById(R.id.qInfo);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });


    }

    private void validate(String userName,String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this,MainMenu.class);
            startActivity(intent);
        }
        else{
            Info.setText("Incorrect Password try again");

        }
    }
}
