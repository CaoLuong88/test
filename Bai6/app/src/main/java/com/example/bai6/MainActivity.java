package com.example.bai6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
        public void onClickLogin(View v){
            Toast.makeText( MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_LONG).show();
    }

}