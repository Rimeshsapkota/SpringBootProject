package com.rimesh.student.user.appController;

import com.rimesh.student.user.entity.User;
import com.rimesh.student.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.PropertyValueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class AppController {

    @Autowired
    private UserRepository repo;

    @GetMapping(" ")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new User());
        return "Signup_form";
    }

    @PostMapping("/process_register")
    public String processRegistration(User user) {
        try {
            log.warn("Printing error message");
            System.out.println(user);
            repo.save(user);
        } catch (PropertyValueException e) {


        }
        return "register_successful";
    }
    @GetMapping("/login")
    public String viewLoginPage(){
        return "login_form";
    }
}