package edu.ustc.busclock.main.history;

/**
 * Created by lenovo on 2016-11-3.
 */

public class HistoryPresenter implements HistoryContract.Presenter {

    private HistoryContract.View mView;

    public HistoryPresenter(HistoryContract.View mView) {
        this.mView = mView;
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
