package edu.ustc.busclock.login;

import edu.ustc.busclock.BasePresenter;
import edu.ustc.busclock.BaseView;

/**
 * Created by lenovo on 2016-11-2.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        String getEmail();

        String getPassword();

        void setError(int type);

        void movetoMainActivity();

    }

    interface Presenter extends BasePresenter {
        boolean attempLogin();
    }
}
