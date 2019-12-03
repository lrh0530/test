package com.example.demo.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SpringBoot {


    public ModelAndView webView(){

        ModelAndView modelAndView = new ModelAndView("index.html");



        return null;
    }

}
