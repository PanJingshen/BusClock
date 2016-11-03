package edu.ustc.busclock.main.account;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.ustc.busclock.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class AccountFragment extends Fragment implements AccountContract.View{

    private AccountContract.Presenter mPresenter;

    public static AccountFragment newInstance() {
        return new AccountFragment();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.account_fragment, container, false);
    }

    @Override
    public void setPresenter(AccountContract.Presenter presenter) {
        mPresenter = presenter;
    }
    
}
