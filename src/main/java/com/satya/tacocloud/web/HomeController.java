package com.satya.tacocloud.web;


import com.satya.tacocloud.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class HomeController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/")
    public String home(@RequestParam(defaultValue = "Aarna") String name, Model model){
        log.info("Name Param is : {}",name);
        log.info("Message is : {}",demoService.getWelcomeMessage(name));
        model.addAttribute("message", demoService.getWelcomeMessage(name));

        return "home";
    }
}
