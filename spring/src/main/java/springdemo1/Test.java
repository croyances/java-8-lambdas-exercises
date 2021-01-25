package springdemo1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");
        User user = (User) applicationContext.getBean("User");
        user.save();
        user.tell();
    }


    @org.junit.Test
    public void A() {

    }


}
