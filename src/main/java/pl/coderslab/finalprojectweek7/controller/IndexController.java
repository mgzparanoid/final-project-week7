package pl.coderslab.finalprojectweek7.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableAutoConfiguration
@ComponentScan()
public class IndexController {
    @GetMapping("/")
    public String IndexController(){
        return "index";
    }
}
