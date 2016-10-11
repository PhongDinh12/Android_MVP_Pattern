package com.example.hiep.mpv_login.login;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.hiep.mpv_login.R;

/**
 * Created by Hiep on 10/11/2016.
 */
public class LoginActivity extends Activity implements LoginView, View.OnClickListener {
    private LoginPresenter loginPresenter;
    private EditText mEdUsername;
    private EditText mEdPassword;
    private Button mBtnLogin;
    private ProgressDialog mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEdPassword=(EditText)findViewById(R.id.ed_login_password);
        mEdUsername=(EditText)findViewById(R.id.ed_login_username);
        mBtnLogin=(Button)findViewById(R.id.btn_login_click);

        mBtnLogin.setOnClickListener(this);

        mProgressBar=new ProgressDialog(this);
        mProgressBar.setMessage("Processing...");
        mProgressBar.setCanceledOnTouchOutside(false);
        mProgressBar.setCancelable(false);

        loginPresenter=new LoginPresenterIplm(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    //implements loginview
    @Override
    public void showProgress() {
        mProgressBar.show();
    }

    @Override
    public void hideProgress() {
        mProgressBar.hide();
    }

    @Override
    public void setError(String message, int code) {
        Toast.makeText(LoginActivity.this,message+", Code: "+code,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void navigateTo() {
        Toast.makeText(LoginActivity.this,"Login success",Toast.LENGTH_SHORT).show();
        onBackPressed();
    }

    //implements Onclick
    @Override
    public void onClick(View view) {
        loginPresenter.validateCredentials(mEdUsername.getText().toString(),mEdPassword.getText().toString());
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
