/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Admin
 */
@Controller
public class ResultController {

    @RequestMapping("/a")
    public String m1() {
        return "poly/a";
    }

    @RequestMapping("/b")
    public String m2(Model model) {
        model.addAttribute("message", "I come from b");
        return "forward:/poly/a"; 
    }

    @RequestMapping("/c")
    public String m3(RedirectAttributes params) {
        params.addAttribute("message", "I come from c");
        return "redirect:/poly/a";  
    }

    @RequestMapping("/d")
    public String m4() {
        return "I come from d";
    }

    @RequestMapping("/testD")
    public String m5(Model model) {
        model.addAttribute("message", m4());
        return "poly/a";  
    }
}
