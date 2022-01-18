package wolox.training.controllers;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GreetingController {

     private static final String NAME = "name";
     private static final String GREETING = "greeting";
     private static final String WORLD = "world";

    @GetMapping("/"+ GREETING)
    public String greeting(@RequestParam(name=NAME, required=false, defaultValue=WORLD) String name, @NotNull Model model) {
        model.addAttribute(NAME, name);
        return GREETING;
    }

}