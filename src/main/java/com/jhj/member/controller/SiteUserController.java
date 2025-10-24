package com.jhj.member.controller;

import com.jhj.member.entity.SiteUser;
import com.jhj.member.repository.SiteUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class SiteUserController {

    @Autowired
    private SiteUserRepository siteUserRepository;

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("userList",siteUserRepository.findAll());
       return "user-list";
    };

    @GetMapping("/new")
    public String createUserForm(Model model) {

        model.addAttribute("user", new SiteUser());

        return "user-form";
    }

    @PostMapping
    public  String createUser(SiteUser siteUser) {

        siteUserRepository.save(siteUser);

        return "redirect:/users";
    }
}
