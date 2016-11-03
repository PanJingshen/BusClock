package edu.ustc.busclock.main.index;

/**
 * Created by lenovo on 2016-11-3.
 */

public class IndexPresenter implements IndexContract.Presenter {

    private IndexContract.View mView;

    public IndexPresenter(IndexContract.View mView) {
        this.mView = mView;
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
