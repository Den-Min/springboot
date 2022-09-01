package com.csdj.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody
    public  String hello(){
        return "Hello Spring Boot";
    }

    @RequestMapping("index")
    public String index(Model model) {
        model.addAttribute("msg", "SpringBoot!");
        return "hello";
    }
}
