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

    @RequestMapping(method = RequestMethod.GET, value = "/contact")
    public String contact() {
        return "contact.html";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/mission")
    public String mission() {
        return "mission.html";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/success-stories")
    public String successStories() {
        return "success-stories.html";
    }



}
