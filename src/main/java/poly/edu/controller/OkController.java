package poly.edu.controller;   // luôn đứng đầu

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/poly")
public class OkController {

    // http://localhost:8080/poly/ok
    @GetMapping("/ok")
    public String ok() {
        return "poly/ok"; // ok.html trong templates/poly/
    }

    // OK 1 -> POST /poly/ok
    @PostMapping("/ok")
    public String m1(Model model) {
        model.addAttribute("message", "m1");
        return "poly/ok";
    }

    // OK 2 -> GET /poly/ok/m2
    @GetMapping(value = "/ok", params = "!") // trick nhỏ để không đụng với ok() phía trên
    public String m2(Model model) {
        model.addAttribute("message", "m2");
        return "poly/ok";
    }

    // OK 3 -> GET /poly/ok/m3
    @PostMapping("/ok/9")
    public String m3(Model model) {
        model.addAttribute("message", "m3");
        return "poly/ok";
    }

}
