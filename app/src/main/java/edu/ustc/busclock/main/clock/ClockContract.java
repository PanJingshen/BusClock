package edu.ustc.busclock.main.clock;

import edu.ustc.busclock.BasePresenter;
import edu.ustc.busclock.BaseView;

/**
 * Created by lenovo on 2016-11-2.
 */

public interface ClockContract {
    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
    }
}
