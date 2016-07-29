package dao.Impl;

import dao.UserDAO;
import domain.UserDO;

/**
 * Created by xpf on 16/7/29.
 */
public class UserDAOImpl implements UserDAO{

    public boolean match(String username, String password) {
        return false;
    }

    public UserDO findUserByName(String username) {
        return null;
    }

    public void update(UserDO userDO) {

    }
}
