package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("demo")
public class HomeController {

    @RequestMapping("mypage")
    public String showPage(Model model){
        model.addAttribute("mykey","test of passing string values from model to thymeleaf");
        ArrayList<Team> list= new ArrayList<>();

        Team p1 = new Team();
        p1.setName("Matt");
        p1.setAge(27);
        p1.setProjectrole("Manager");

        list.add(p1);

        Team p2= new Team();
        p2.setName("Eric");
        p2.setAge(27);
        p2.setProjectrole("Developer");

        list.add(p2);

        Team p3= new Team();
        p3.setName("Bili");
        p3.setAge(27);
        p3.setProjectrole("Tester");
        list.add(p3);

        model.addAttribute("myteam", list);
        return "mypage";
    }
}
