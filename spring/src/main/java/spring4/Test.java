package spring4;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/8 14:00
 */
public class Test {

    @Autowired
    private static Say say;

    public static void main(String[] args) {
//        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(JavaConfig.class);
//        Say beanFactorys=applicationContext.getBean(Say.class);
//        beanFactorys.say();

        Test t = new Test();;
        say.say();
    }
}
