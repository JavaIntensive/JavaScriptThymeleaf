package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("demo")
public class HomeController {
@Autowired
TeamRepository teamRepository;

    @RequestMapping("mypage")
    public String showPage(Model model){
        model.addAttribute("mykey","test of passing string values from model to thymeleaf");
        ArrayList<Team> list= new ArrayList<>();

        Team p1 = new Team();
        p1.setName("Matt");
        p1.setAge(27);
        p1.setProjectrole("Manager");

        list.add(p1);
        teamRepository.save(p1);
        Team p2= new Team();
        p2.setName("Eric");
        p2.setAge(27);
        p2.setProjectrole("Developer");

        list.add(p2);
        teamRepository.save(p2);

        Team p3= new Team();
        p3.setName("Bili");
        p3.setAge(27);
        p3.setProjectrole("Tester");
        list.add(p3);
        teamRepository.save(p3);
        model.addAttribute("myteam", list);
        return "mypage";
    }

    @GetMapping("/showTeam")
    public String showTeam(Model model){

        Team p1 = new Team();
        p1.setName("Matt");
        p1.setAge(27);
        p1.setProjectrole("Manager");
        teamRepository.save(p1);
        model.addAttribute("showTeam", teamRepository.findAll());
        return "showTeam";
    }
}
