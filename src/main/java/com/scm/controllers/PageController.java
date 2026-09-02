package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    //about route 
   


    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page ");

        //sending data to the view
        model.addAttribute("name", "Akash");
        model.addAttribute("youtubeChannel", "My YouTube Channel");
        model.addAttribute("github", "github.com/akash");
        model.addAttribute("myYoutubechannelLink","https://www.youtube.com/@AGEngineeringMantra");
        return "home";
    }

}
