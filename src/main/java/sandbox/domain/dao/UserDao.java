package sandbox.domain.dao;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;

import sandbox.domain.entity.User;

@Singleton
public class UserDao {

    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setId(1l);
        user.setName("mkt-Do");
        userList.add(user);
        return userList;
    }
}
