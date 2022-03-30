package com.example.HelloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {

    @GetMapping("/Web")
    public String Hello(){
        return "hello";
    }

    @GetMapping("/Web/Message")
    public String message(Model model){
        model.addAttribute("message",
                "this is a custom message Hello From BridgLabz");
        return "message";
    }
}
