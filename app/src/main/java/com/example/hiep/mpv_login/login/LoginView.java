package com.example.hiep.mpv_login.login;

/**
 * Created by Hiep on 10/11/2016.
 */

/*
 * LoginView là một lớp giao diện cho phép phương thức hiển thị có thể đuợc thực thi hay hoán đổi dễ dàng trên nhiều Activity khác nhau
 */
public interface LoginView {
    void showProgress();
    void hideProgress();
    void setError(String message,int code);
    void navigateTo();
}
