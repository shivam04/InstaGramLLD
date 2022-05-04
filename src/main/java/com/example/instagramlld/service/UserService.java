package com.example.instagramlld.service;

import com.example.instagramlld.dtos.EntityDTO;
import com.example.instagramlld.dtos.UserDTO;
import com.example.instagramlld.model.User;
import com.example.instagramlld.repositories.UserRepository;

import java.util.List;

/**
 * Created by shivam.si on 04/05/22 12:52 pm
 */

public class UserService {
    UserRepository userRepository = new UserRepository();
    EntityService entityService = new EntityService();

    public UserDTO getUser(long id) {
        return getResponse(userRepository.getUser(id));
    }

    public UserDTO registerUser(User user) {
        return getResponse(userRepository.registerUser(user));
    }

    public UserDTO getResponse(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setUserName(user.getUserName());
        userDTO.setDateOfBirth(user.getDateOfBirth());
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }

    public List<EntityDTO> getUserFeed(User user) {
        return entityService.getUserFeed(user);
    }
}
