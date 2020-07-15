package springdemo1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


public class UserImpl implements User {

    @Resource
    private  UserDAO userDAO;

    @Override
    public void save() {

        UserProxy userProxy = new UserProxy(userDAO);
        userProxy.createProxy().say();

        System.out.println("User  save 方法执行了");
    }

    @Override
    public void tell() {
        UserProxy userProxy = new UserProxy(userDAO);
        userProxy.createProxy().tell();


    }
}
