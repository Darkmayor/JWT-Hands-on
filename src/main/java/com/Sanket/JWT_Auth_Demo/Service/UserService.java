package com.Sanket.JWT_Auth_Demo.Service;

import com.Sanket.JWT_Auth_Demo.Entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService(){
        userList.add(new User(UUID.randomUUID().toString() , "Sanket Kalokhe" , "sanketkalokhe123@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString() , "Sachin Guldagad" , "sachinguldagad@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString() , "Dhanesh Dhatrak" , "DhaneshDhartrak@gmail.com"));
        userList.add(new User(UUID.randomUUID().toString() , "shantanu Wadjikar" , "shantanuwadjikar@gmail.com"));
    }

    public List<User> getAllUsers(){
        return userList;
    }
}
