package com.Sanket.JWT_Auth_Demo.Controller;

import com.Sanket.JWT_Auth_Demo.Entities.User;
import com.Sanket.JWT_Auth_Demo.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/getUser")
    public List<User> getHome(){

        logger.warn("Called getUser method");
        return userService.getAllUsers();
    }

    @GetMapping("/currentActiveUser")
    public String getCurrentUser(Principal principal){
        logger.info("Displaying Current Active user");
        String currentUser = SecurityContextHolder.getContext().getAuthentication().getName();
        return currentUser;
    }
}
