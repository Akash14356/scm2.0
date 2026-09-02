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


     @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin", false);
        System.out.println("About page Loading"); 
        return "about";
    }
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Services page Loading"); 
        return "services";
    } // contact page

    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    @GetMapping("/login")
    public String login() {
        return new String("login");
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
}
