package edu.ustc.busclock.entry.login;

import edu.ustc.busclock.BasePresenter;
import edu.ustc.busclock.BaseView;
import edu.ustc.busclock.entry.register.RegisterContract;

/**
 * Created by lenovo on 2016-11-2.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        String getEmail();

        String getPassword();

        void setError(int type);

        void movetoMainActivity();


        void movetoRegisterView(RegisterContract.View registerfragment);
    }

    interface Presenter extends BasePresenter {
        boolean attempLogin();
    }
}
