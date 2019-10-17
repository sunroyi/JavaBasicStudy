package sun.study.Mybatis.Dao;

import sun.study.Mybatis.Entity.User;

import java.util.List;

public interface UserDao {

    void insert(User user);

    void update(User user);

    void delete(User user);

    User get(User user);

    List<User> findList(User user);
}
