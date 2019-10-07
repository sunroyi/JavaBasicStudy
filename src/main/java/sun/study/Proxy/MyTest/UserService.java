package sun.study.Proxy.MyTest;

public class UserService implements UserServiceInterface{

    @Override
    public User getUserById(int id) {
        return new User(id,"Sun",1);
    }
}
