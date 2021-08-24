package com.rony.controllers;

import com.rony.models.User;
import com.rony.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public String allUsers(Model model){
        model.addAttribute("users",userService.getAll());
        return "users/allUsers";
    }

    @GetMapping("/add")
    public String addUser_GET(Model model){
        model.addAttribute("user",new User());
        return "users/addUser";
    }

    @PostMapping("/add")
    public String addUser_Post(@Valid @ModelAttribute(name = "user") User user, Model model){
        userService.addUser(user);
        return "redirect: /users/all";
    }

}
