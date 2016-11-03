package edu.ustc.busclock.model.Dao;

import edu.ustc.busclock.model.javabean.User;

/**
 * Created by lenovo on 2016-11-2.
 */

public interface IUser {

    public boolean addUser(String email, String password, String username, String phone);
    public boolean delUser(int user_id);
    public boolean editUser(String email, String password, String username, String phone);
    public User getUser(int user_id);
    public boolean getUser(String email ,String passowrd);

}
