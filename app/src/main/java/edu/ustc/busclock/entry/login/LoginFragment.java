package edu.ustc.busclock.entry.login;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import edu.ustc.busclock.R;
import edu.ustc.busclock.entry.register.RegisterContract;

/**
 * A placeholder fragment containing a simple view.
 */
public class LoginFragment extends Fragment implements LoginContract.View {


    private EditText et_email;
    private EditText et_password;
    private Button btn_login;
    private Button btn_register;
    private LoginContract.Presenter mPresenter;


    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.login_fragment, container, false);


        //init the UI
        et_email = (EditText) root.findViewById(R.id.login_et_email);
        et_password = (EditText) root.findViewById(R.id.login_et_password);
        btn_login = (Button) root.findViewById(R.id.login_btn_login);
        btn_register = (Button) root.findViewById(R.id.login_btn_register);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                System.out.println(mPresenter);
                mPresenter.attempLogin();
            }
        });


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return root;
    }

    @Override
    public String getEmail() {
        return et_email.getText().toString();
    }

    @Override
    public String getPassword() {
        return et_password.getText().toString();
    }

    @Override
    public void setError(int type) {
        String errorText = "";
        switch (type) {
            case 0:
                errorText = "Format of email is wrong!";
                break;
            case 1:
                errorText = "Format of password is wrong!";
                break;
            case 2:
                errorText = "";
                break;
        }
        Toast.makeText(getContext(), errorText, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void movetoMainActivity() {
        Intent intent = new Intent("edu.ustc.busclock.intent.action.MAIN");
        startActivity(intent);
    }

    @Override
    public void movetoRegisterView(RegisterContract.View registerfragment) {
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.contentFrame, (Fragment) registerfragment).commit();
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
