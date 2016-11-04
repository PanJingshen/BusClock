package edu.ustc.busclock.entry.register;

import edu.ustc.busclock.BasePresenter;
import edu.ustc.busclock.BaseView;

/**
 * Created by lenovo on 2016-11-2.
 */

public interface RegisterContract {
    interface View extends BaseView<Presenter> {
        String getEmail();

        String getPassword();

        String getPhone();

        void setError(int type);

        void movetoLoginView();

    }

    interface Presenter extends BasePresenter {
        boolean attempLogin();
    }
}
