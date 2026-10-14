package com.vivek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/login")
public class UserController {

        @GetMapping
        public String loginUser(
                @RequestParam(required = false) String name,
                @RequestParam(required = false) String email,
                Model model) {

            if (name != null && email != null) {
                String str = "Welcome " + name
                        + ", your email is " + email;

                model.addAttribute("str", str);
            }

            return "login";
        }
    }


