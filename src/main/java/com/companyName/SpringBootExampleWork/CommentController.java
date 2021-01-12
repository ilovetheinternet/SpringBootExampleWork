package com.companyName.SpringBootExampleWork;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {

    @GetMapping("/comment")
    public String commentForm(Model model) {
        model.addAttribute("view", new Comment());
        return "comment";
    }

    @PostMapping("/comment")
    public String commentSubmit(@ModelAttribute Comment comment, Model model) {
        model.addAttribute("comment", comment);
        return "result";
    }
}
