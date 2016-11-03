package edu.ustc.busclock.login;

import edu.ustc.busclock.model.Dao.DaoImpl.UserDao;
import edu.ustc.busclock.model.Dao.IUser;

/**
 * Created by lenovo on 2016-11-2.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View mView;
    private IUser user;

    public LoginPresenter(LoginContract.View LoginView) {
        mView = LoginView;
        mView.setPresenter(this);
        user = new UserDao();
    }

    @Override
    public boolean attempLogin() {
        //Test
        if (true){
//        if (checkLogin()){
            mView.movetoMainActivity();
            return true;
        }else
        return false;
    }

    private boolean checkLogin() {
        //check the format of email
        if (!isEmailValid()){
            mView.setError(0);
            return false;
        }
        //check the format of password
        if (!isPasswordValid()){
            mView.setError(1);
            return false;
        }
        //check the emial is match the password
        if (!user.getUser(mView.getEmail(),mView.getPassword())){
            mView.setError(2);
            return false;
        }
        return  true;

    }

    private boolean isPasswordValid() {
        String password = mView.getPassword();
        return password.length()>4;
    }

    private boolean isEmailValid() {
        String email = mView.getEmail();
        return email.contains("@");

    }

    @Override
    public void start() {



    }
}
