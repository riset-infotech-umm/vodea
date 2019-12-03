package com.infotech.riset.vodea.LoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.infotech.riset.vodea.R;

public class RegisterActivity extends AppCompatActivity {
    ImageButton btnBack;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();

        initView();
        action();
    }

    private void action() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);

                finish();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            //Setting auth disini yaa :*
            @Override
            public void onClick(View view) {
                
            }
        });
    }

    private void initView() {
        btnBack = findViewById(R.id.btn_back);
        btnSignUp = findViewById(R.id.sign_up);
    }
}
