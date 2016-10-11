package com.example.hiep.mpv_login.login;

/**
 * Created by Hiep on 10/11/2016.
 */

/*
 * OnLoginFinishedListener ở đây được sử dụng như một custom listener cho phép đa dạng hóa các phương thức hiển thị kết quả tới người dùng.
 */
public interface OnLoginFinishedListener {
    void onError(String message, int code);
    void onSuccess();
}
