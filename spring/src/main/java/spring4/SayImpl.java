package spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/8 13:59
 */
@Service
public class SayImpl implements Say{


    private User user;

//    @Autowired
//    public SayImpl(User user) {
//        this.user = user;
//    }

    @Autowired
    public void setUserA(User user){
        System.out.println(333);
        this.user = user;
        System.out.println(999);
    }



    @Override
    public void say() {
        System.out.println(1);
        user.setName("45");
        System.out.println(user.getName());
    }


}
