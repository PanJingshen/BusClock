package edu.ustc.busclock.model.Dao.DaoImpl;

import edu.ustc.busclock.model.Dao.IUser;
import edu.ustc.busclock.model.javabean.User;

/**
 * Created by lenovo on 2016-11-2.
 */

public class UserDao implements IUser {


    @Override
    public boolean addUser(String email, String password, String username, String phone) {
        return false;
    }

    @Override
    public boolean delUser(int user_id) {
        return false;
    }

    @Override
    public boolean editUser(String email, String password, String username, String phone) {
        return false;
    }

    @Override
    public User getUser(int user_id) {
        return null;
    }

    @Override
    public boolean getUser(String email, String passowrd) {
        return true;
    }


}
