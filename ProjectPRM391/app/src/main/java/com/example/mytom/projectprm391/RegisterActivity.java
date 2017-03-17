package com.example.mytom.projectprm391;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mytom on 3/3/2017.
 */

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mCancelbtn, mSubmitbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mCancelbtn = (Button) findViewById(R.id.btnCancel_register);
        mSubmitbtn = (Button) findViewById(R.id.btnSubmit_register);
        mCancelbtn.setOnClickListener(this);
        mSubmitbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btnCancel_register:
                Intent intent = new Intent(this, LoginActivity.class);
                finish();
                startActivity(intent);

                break;
            case R.id.btnSubmit_register:
                intent = new Intent(this, HomeActivity.class);
                finish();
                startActivity(intent);
                break;
        }
    }
}
