package edu.ustc.busclock.main.account;

/**
 * Created by lenovo on 2016-11-3.
 */

public class AccountPresenter implements AccountContract.Presenter {

    private AccountContract.View mView;

    public AccountPresenter(AccountContract.View mView) {
        this.mView = mView;
        mView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
