package poly.edu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import poly.edu.model.Product;

@Controller
public class ProductControllerB4 {

    @GetMapping("/product/formB4")
    public String form(Model model,
                       @RequestParam(name = "page", defaultValue = "1") int page) {

        Product p = new Product();
        p.setName("iPhone 30");
        p.setPrice(50000.00);
        model.addAttribute("product", p);

        // phân trang cho danh sách items
        int pageSize = 5;
        List<Product> all = getItems();
        int start = (page - 1) * pageSize;
        int end = Math.min(start + pageSize, all.size());
        List<Product> subList = all.subList(start, end);

        int totalPages = (int) Math.ceil((double) all.size() / pageSize);

        model.addAttribute("items", subList);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);

        return "poly/product/formB4";
    }

    @PostMapping("/product/saveB4")
    public String save(@ModelAttribute("product") Product p, Model model,
                       @RequestParam(name = "page", defaultValue = "1") int page) {
        model.addAttribute("product", p);

        // phân trang lại sau khi save
        int pageSize = 5;
        List<Product> all = getItems();
        int start = (page - 1) * pageSize;
        int end = Math.min(start + pageSize, all.size());
        List<Product> subList = all.subList(start, end);

        int totalPages = (int) Math.ceil((double) all.size() / pageSize);

        model.addAttribute("items", subList);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);

        return "poly/product/formB4";
    }

    // ✅ danh sách 20 sản phẩm, không dùng vòng for
    @ModelAttribute("allItems")
    public List<Product> getItems() {
        return Arrays.asList(
                new Product("A", 1.00),
                new Product("B", 12.00),
                new Product("C", 13.00),
                new Product("D", 14.00),
                new Product("E", 15.00),
                new Product("F", 16.00),
                new Product("G", 17.00),
                new Product("H", 18.00),
                new Product("I", 19.00),
                new Product("J", 20.00),
                new Product("K", 21.00),
                new Product("L", 22.00),
                new Product("M", 23.00),
                new Product("N", 24.00),
                new Product("O", 25.00),
                new Product("P", 26.00),
                new Product("Q", 27.00),
                new Product("R", 28.00),
                new Product("S", 29.00),
                new Product("T", 30.00)
        );
    }
}
