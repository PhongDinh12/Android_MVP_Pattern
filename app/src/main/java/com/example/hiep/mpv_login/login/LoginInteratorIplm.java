package com.example.hiep.mpv_login.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by Hiep on 10/11/2016.
 */
public class LoginInteratorIplm implements LoginInterator {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener onLoginFinishedListener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error=false;
                if (username==null || TextUtils.isEmpty(username)){
                    onLoginFinishedListener.onError("username is not empty",401);
                    error=true;
                }

                if (password==null || TextUtils.isEmpty(password)){
                    onLoginFinishedListener.onError("password is not empty",401);
                    error=true;
                }

                if (!error){
                    onLoginFinishedListener.onSuccess();
                }
            }
        },2000);
    }
}
