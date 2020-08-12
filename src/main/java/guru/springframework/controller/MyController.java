package guru.springframework.controller;

import org.springframework.stereotype.Controller;

@Controller("myController")
public class MyController {

    public String hello() {
        System.out.println("Hello World controller");
        return "foo";
    }
}
