package com.sample.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
class Solution {
    private String name;
    private String lname;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }
}

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        Solution s = new Solution();
        s.setName("John");
        s.setLname("Doe wcu");
        return s.getName() + " " + s.getLname();
    }
}
