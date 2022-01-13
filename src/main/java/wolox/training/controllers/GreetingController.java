package wolox.training.controllers;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GreetingController {

    private static final String NAME = "name";

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name=NAME, required=false, defaultValue="World") String name, @NotNull Model model) {
        model.addAttribute(NAME, name);
        return "greeting";
    }

}