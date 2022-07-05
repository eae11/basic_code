package ser.dao;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import ser.domain.User;

import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {
    @Test
    public void test() {
        User user = new User();
        try {
//            BeanUtils.setProperty(user, "username", "zhangsan");
            BeanUtils.setProperty(user, "hh", "male");
            System.out.println(user);
            String gender = BeanUtils.getProperty(user, "hh");
            System.out.println(gender);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
