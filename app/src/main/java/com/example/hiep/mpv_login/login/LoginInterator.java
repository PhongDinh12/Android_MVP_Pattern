package com.example.hiep.mpv_login.login;

/**
 * Created by Hiep on 10/11/2016.
 */

/*
 * Giống như với OnLoginFinishedListener, LoginInteractor cũng cho phép custom các phương thức tương tác của người dùng với ứng dụng.
 */
public interface LoginInterator {
    void login(String username,String password, OnLoginFinishedListener onLoginFinishedListener);
}
