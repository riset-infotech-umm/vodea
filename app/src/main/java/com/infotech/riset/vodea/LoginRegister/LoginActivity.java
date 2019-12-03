package com.infotech.riset.vodea.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.infotech.riset.vodea.Home.HomeActivity;
import com.infotech.riset.vodea.R;


public class LoginActivity extends AppCompatActivity {
    Button btnSignUp, btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        initView();
        action();
    }

    private void action() {
        // Setting Auth disini sayang :*
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);

                finish();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }

    private void initView() {
        btnSignUp = findViewById(R.id.signup);
        btnSignIn = findViewById(R.id.login);
    }
}
