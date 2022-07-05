package ser.dao;

import org.junit.Test;
import ser.domain.User;

public class Test1 {
    @Test
    public void testlogin() {
        User loginuser = new User(3, "superbaby", "123");
        UserDao userDao = new UserDao();
        User user = userDao.login(loginuser);
        System.out.println(user);
    }
}
