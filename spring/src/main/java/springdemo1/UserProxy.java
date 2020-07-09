package springdemo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: croyances
 * @Date: 2020/7/8 22:21
 * @version: 1.0
 */
public class UserProxy {

    private UserDAO userDAO;

    UserProxy(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public  UserDAO createProxy(){
        UserDAO u =(UserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("say".equals(method.getName())) {
                    System.out.println("增强say方法");
                    return method.invoke(userDAO);
                }
                return method.invoke(userDAO);
            }


        });
        return u;
    }


}

