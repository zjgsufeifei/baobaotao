package dao;

import domain.UserDO;

/**
 * Created by xpf on 16/7/29.
 */
public interface UserDAO {

    public boolean match(String username, String password);

    public UserDO findUserByName(String username);

    public void update(UserDO userDO);
}
