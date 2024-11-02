package com.helloUser.HelloUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StartController {
    
    public static final List<Member> memberList = new ArrayList<>();

    static {
        memberList.add(new Member("Niklas", 41));
        memberList.add(new Member("Roger", 41));
        memberList.add(new Member("Sara", 38));
      }

      Login loginInfo = new Login("admin", "admin");
    
      @GetMapping("/")
      public String getStart() {
          return "start";
      }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("member", new Member(null, 0));
        System.out.println(model+"Printar model");
        return "form";
    }


    @PostMapping("/submitForm")
    public String addMember(@RequestParam("name") String name, @RequestParam("age") int age){

    memberList.add(new Member(name, age));
    return "redirect:/members";
    }

    @GetMapping("/members")
    String getMemberList(Model model) {
    model.addAttribute("members", memberList);
    return "members";
    }

    @PostMapping("/removeMember")
    public String removeMember(@RequestParam("index") int index) {
        if (index >= 0 && index < memberList.size()) {
            memberList.remove(index);
        }
        return "redirect:/members";
    }

    @GetMapping("/memberpublic")
    String getMemberPublicList(Model model) {
    model.addAttribute("members", memberList);
    return "/memberpublic";
    }
   

    @GetMapping("/adminlogin")
    public String getAdminLogin(Model model) {
        model.addAttribute("loginInfo", loginInfo);
        return "/adminlogin";
    }
    
    @GetMapping("/adminstart")
    public String getadminStart() {
        return "/adminstart";
    }

}


    
    
