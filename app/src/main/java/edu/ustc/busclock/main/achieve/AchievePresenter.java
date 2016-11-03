package edu.ustc.busclock.main.achieve;

/**
 * Created by lenovo on 2016-11-3.
 */

public class AchievePresenter implements AchieveContract.Presenter {

    private AchieveContract.View mView;

    public AchievePresenter(AchieveContract.View mView) {
        this.mView = mView;
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
