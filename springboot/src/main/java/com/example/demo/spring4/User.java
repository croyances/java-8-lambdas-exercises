package com.example.demo.spring4;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/9/9 10:10
 */
//@Component
public class User {

    private Say say;

//    @Autowired
//    public User(Say say) {
//        this.say = say;
//    }

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

    private void AS() {
    }
}
