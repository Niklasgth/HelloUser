package com.helloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class FormController {
    
    @GetMapping("/form")
    public String getForm(Model model) {
        model.addAttribute("member", new Member(null, 0, false, 0));
        System.out.println(model+"Printar model");
        return "form";
    }
    
    @PostMapping("/create-new-member")
    public String newMember(Member member) {
        System.out.println("Member added: " + member);
        
        return "redirect:/form";
    }
}





