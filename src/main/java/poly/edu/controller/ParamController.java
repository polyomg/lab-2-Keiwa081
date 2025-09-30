package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ParamController {

    @RequestMapping("/param/form")
    public String form() {
        return "poly/form";
    }

    @RequestMapping(value = "/param/save/{x}", method = RequestMethod.POST)
    public String save(
            @PathVariable("x") String x,
            @RequestParam("y") String y,
            Model model) {

        // Gửi dữ liệu sang view
        model.addAttribute("x", x);
        model.addAttribute("y", y);

        return "poly/form";
    }
}

