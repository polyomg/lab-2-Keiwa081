package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import poly.edu.model.Product;

@Controller
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/form")
    public String form(Model model) {
        // Gửi product rỗng lần đầu để Thymeleaf không bị null
        model.addAttribute("product", new Product());
        return "poly/product/form"; 
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product, Model model) {
        model.addAttribute("product", product);
        return "poly/product/form";
    }
}
