package com.Sanket.JWT_Auth_Demo.Controller;

import com.Sanket.JWT_Auth_Demo.Entities.User;
import com.Sanket.JWT_Auth_Demo.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUser")
    public List<User> getHome(){
        Logger logger = LoggerFactory.getLogger(HomeController.class);
        logger.info("Called getUser method");
        return userService.getAllUsers();
    }
}
