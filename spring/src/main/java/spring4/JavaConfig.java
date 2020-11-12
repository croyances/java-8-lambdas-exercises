package spring4;

import org.springframework.context.annotation.Bean;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/8 13:59
 */

//@ComponentScan("spring4")
//@Configuration
public class JavaConfig {

    @Bean
    public Say say(){
        return new SayImpl();
    }
    @Bean
    public User user(){
        return new User();
    }

    /***
     * 使用@bean 不component
     */
}
