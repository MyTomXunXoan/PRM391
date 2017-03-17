package com.example.mytom.projectprm391;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mLoginBtn, mRegisterBtn;
    private EditText mUsernameEdt, mPasswordEdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginBtn = (Button) findViewById(R.id.btn_login);
        mRegisterBtn = (Button) findViewById(R.id.btn_register);
        mUsernameEdt = (EditText) findViewById(R.id.edt_username);
        mPasswordEdt = (EditText) findViewById(R.id.edt_password);
        mLoginBtn.setOnClickListener(this);
        mRegisterBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id_view = v.getId();
        switch (id_view){
            case R.id.btn_login:
                Intent intent = new Intent(this, HomeActivity.class);
                finish();
                startActivity(intent);
                break;
            case R.id.btn_register:
                intent = new Intent(this, RegisterActivity.class);
                finish();
                startActivity(intent);
                break;
        }
    }
}
