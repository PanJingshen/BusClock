package edu.ustc.busclock.entry;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import edu.ustc.busclock.R;
import edu.ustc.busclock.entry.login.LoginContract;
import edu.ustc.busclock.entry.login.LoginFragment;
import edu.ustc.busclock.entry.login.LoginPresenter;
import edu.ustc.busclock.utils.ActivityUtils;

public class EntryActivity extends AppCompatActivity {

    private LoginContract.Presenter mPresenter;
    private LoginFragment loginFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        //config the fragment
        if (loginFragment == null) {
            loginFragment = loginFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    loginFragment, R.id.contentFrame);
        }
        new LoginPresenter(loginFragment);

    }


}
