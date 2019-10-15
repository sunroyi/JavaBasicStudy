package sun.study.Mybatis.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.study.Mybatis.Dao.UserDao;
import sun.study.Mybatis.Entity.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void insert(User user){
        userDao.insert(user);
    }

    public void update(User user){
        userDao.update(user);
    }

    public void delete(User user){
        userDao.delete(user);
    }

    public User get(User user){
        return userDao.get(user);
    }

    public List<User> findList(User user){
        return userDao.findList(user);
    }
}
