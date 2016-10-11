package com.example.hiep.mpv_login.login;

/**
 * Created by Hiep on 10/11/2016.
 */


/*
 * LoginPresenter cũng giúp cho việc triển khai nhiều logic trên cùng một Activity hay hoán đổi các logic này cho nhau thông qua việc khởi tạo một lớp Implement khác.
 */
public interface LoginPresenter {
    void validateCredentials(String username,String password);
}
