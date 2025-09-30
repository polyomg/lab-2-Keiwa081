package poly.edu.controller;   // luôn đứng đầu

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/poly")
public class OkController {

    @GetMapping("/ok")
    public String ok() {
        return "poly/ok"; 
    }

    @PostMapping("/ok")
    public String m1(Model model) {
        model.addAttribute("message", "m1");
        return "poly/ok";
    }

    @GetMapping(value = "/ok", params = "!") 
    public String m2(Model model) {
        model.addAttribute("message", "m2");
        return "poly/ok";
    }

    @PostMapping("/ok/9")
    public String m3(Model model) {
        model.addAttribute("message", "m3");
        return "poly/ok";
    }

}
