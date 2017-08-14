package com.guenther.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView helloWorld()
    {
        ModelAndView mv = new
                ModelAndView("welcome");
        mv.addObject("message","Choose One of Our Delicious Coffee Selections!!!");
        mv.addObject("bob", "Please fill the form to register!");
        mv.addObject("title", "Welcome to Grand Circus Coffee Shop!!!");
        return mv;
    }

    @RequestMapping("/userform")
    public ModelAndView userform () {
        return new ModelAndView("form", "inst",
                "Please enter info: ");
    }

    @RequestMapping("/formhandler")
    public ModelAndView formhandler (
            @RequestParam("firstname") String firstname,
            @RequestParam("lastname") String lastname,
            @RequestParam("email") String email,
            @RequestParam("phonenumber") String phonenumber,
            @RequestParam("password") String password
    ) {

        //here's where the magic happens

        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("firstname", firstname);
        mv.addObject("lastname", lastname);
        mv.addObject("email", email);
        mv.addObject("phonenumber", phonenumber);
        mv.addObject("password", password);
        return mv;
    }
}