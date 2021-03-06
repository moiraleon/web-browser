package com.web.browser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    //need to be configured for thymeleaf
//    @RequestMapping("/success-stories")
//    public String listStories(ModelMap modelMap){
//        List<Story> story = StoryRepository.getAll_STORIES();
//        modelMap.put("stories",stories);
//        return "success-stories.html";
//    }



//    @RequestMapping("/story/{id}")
//    public String postDetails(@PathVariable Long id, ModelMap modelMap){
//        Story story = StoryRepository.findById(id);
//        modelMap.put("story", story);
//        return "story-details.html";
//
//    }



}
