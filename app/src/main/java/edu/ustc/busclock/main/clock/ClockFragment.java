package edu.ustc.busclock.main.clock;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.ustc.busclock.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ClockFragment extends Fragment implements ClockContract.View{

    private ClockContract.Presenter mPresenter;

    public static ClockFragment newInstance() {
        return new ClockFragment();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.clock_fragment, container, false);
    }

    @Override
    public void setPresenter(ClockContract.Presenter presenter) {
        mPresenter = presenter;
    }

}
