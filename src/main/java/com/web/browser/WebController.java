package com.web.browser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class WebController {

//    @GetMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

//    @RequestMapping("/")
//    public String welcome() {
//        return "home";
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index() {
        return "home.html";
    }
}
