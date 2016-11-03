package edu.ustc.busclock.main.history;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.ustc.busclock.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class HistoryFragment extends Fragment implements HistoryContract.View{

    private HistoryContract.Presenter mPresenter;

    public static HistoryFragment newInstance() {
        return new HistoryFragment();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.history_fragment, container, false);
    }

    @Override
    public void setPresenter(HistoryContract.Presenter presenter) {
        mPresenter = presenter;
    }

}
