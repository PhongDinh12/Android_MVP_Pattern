package com.example.hiep.mpv_login.login;

/**
 * Created by Hiep on 10/11/2016.
 */
public class LoginPresenterIplm implements LoginPresenter,OnLoginFinishedListener {
    private LoginView loginView;
    private LoginInterator loginInterator;

    public LoginPresenterIplm(LoginView loginView) {
        this.loginView = loginView;
        loginInterator=new LoginInteratorIplm();
    }

    //implements LoginPresenter
    @Override
    public void validateCredentials(String username, String password) {
        loginView.showProgress();
        loginInterator.login(username,password,this);
    }

    //implement OnLoginFinishedListener
    @Override
    public void onError(String message, int code) {
        loginView.hideProgress();
        loginView.setError(message,code);
    }

    @Override
    public void onSuccess() {
        loginView.hideProgress();
        loginView.navigateTo();
    }
}
