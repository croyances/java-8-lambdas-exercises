package springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: croyances
 * @Date: 2020/7/15 20:39
 * @version: 1.0
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String say() {
        System.out.println("Hello");
        return "success";
    }


}
