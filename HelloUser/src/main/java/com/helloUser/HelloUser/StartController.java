package com.helloUser.HelloUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StartController {

    @GetMapping("/")
    public String getStart() {
        return "start";
    }
    
}
