package edu.ustc.busclock.main.index;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.ustc.busclock.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class IndexFragment extends Fragment implements IndexContract.View{

    private IndexContract.Presenter mPresenter;

    public static IndexFragment newInstance() {
        return new IndexFragment();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.index_fragment, container, false);
    }

    @Override
    public void setPresenter(IndexContract.Presenter presenter) {
        mPresenter = presenter;
    }

}
