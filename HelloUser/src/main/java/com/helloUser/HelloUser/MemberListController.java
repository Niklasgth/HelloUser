package com.helloUser.HelloUser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MemberListController {

    private static List<Member> members = new ArrayList<>();

    static{
        members.add(new Member("Per", 55, true,1));
        members.add(new Member("Gurkan", 44, true,2));
        members.add(new Member("Gyra", 22, false,3));
        members.add(new Member("Tyll", 33, false,4));
    }




@GetMapping("/memberlist")
public String getMemberList(Model model) {
    model.addAttribute("members", members);
    return "memberlist";
}


}
