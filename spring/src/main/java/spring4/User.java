package spring4;

import org.springframework.stereotype.Component;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/9 10:10
 */
@Component

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
        System.out.println(1);
    }
}
