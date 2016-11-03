package edu.ustc.busclock.main.achieve;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.ustc.busclock.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class AchieveFragment extends Fragment implements AchieveContract.View{

    private AchieveContract.Presenter mPresenter;

    public static AchieveFragment newInstance() {
        return new AchieveFragment();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.achieve_fragment, container, false);
    }

    @Override
    public void setPresenter(AchieveContract.Presenter presenter) {
        mPresenter = presenter;
    }

}
