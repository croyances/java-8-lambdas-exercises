package springdemo1;

import org.springframework.stereotype.Component;

/**
 * @Author: croyances
 * @Date: 2020/7/8 21:43
 * @version: 1.0
 */
@Component("UserDAO")
public class UserDAOImpl implements  UserDAO {

    @Override
    public void say() {
        System.out.println("UserDAO  Say 方法执行了");
    }

    @Override
    public void tell() {
        System.out.println("UserDAO  tell 方法执行了");
    }
}
