package com.example.instagramlld.controller;

import com.example.instagramlld.dtos.EntityDTO;
import com.example.instagramlld.dtos.UserDTO;
import com.example.instagramlld.model.User;
import com.example.instagramlld.service.UserService;

import java.util.List;

/**
 * Created by shivam.si on 04/05/22 12:51 pm
 */

public class UserController {
    UserService userService = new UserService();
    public UserDTO getUser(long id) {
        return userService.getUser(id);
    }

    public UserDTO registerUser(User user) {
        return userService.registerUser(user);
    }

    public List<EntityDTO> getUserFeed(User user) {
        return userService.getUserFeed(user);
    }
}
