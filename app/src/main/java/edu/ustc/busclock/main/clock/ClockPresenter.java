package edu.ustc.busclock.main.clock;

/**
 * Created by lenovo on 2016-11-3.
 */

public class ClockPresenter implements ClockContract.Presenter {

    private ClockContract.View mView;

    public ClockPresenter(ClockContract.View mView) {
        this.mView = mView;
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
