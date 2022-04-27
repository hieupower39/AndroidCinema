package com.example.cinemaapi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    CinemaServiceAPI cinemaService;
    Button btnHello, btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //text = findViewById(R.id.text);
        btnLogin = findViewById(R.id.btnLogin);
        btnHello = findViewById(R.id.btnHello);
        cinemaService = new CinemaServiceAPI();
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, cinemaService.callHello(), Toast.LENGTH_SHORT).show();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, cinemaService.callLogin("admin","admin"), Toast.LENGTH_SHORT).show();
            }
        });
    }

}