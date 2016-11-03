package edu.ustc.busclock.login;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import edu.ustc.busclock.R;
import edu.ustc.busclock.utils.ActivityUtils;

public class LoginActivity extends AppCompatActivity {

    private LoginContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        //config the fragment
        LoginFragment loginFragment = (LoginFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);
        if (loginFragment == null) {
            loginFragment = loginFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    loginFragment, R.id.contentFrame);
        }
        new LoginPresenter(loginFragment);

    }


}
