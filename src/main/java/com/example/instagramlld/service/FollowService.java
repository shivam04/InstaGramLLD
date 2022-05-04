package com.example.instagramlld.service;

import com.example.instagramlld.dtos.FollowDTO;
import com.example.instagramlld.dtos.FollowersFollowingDTO;
import com.example.instagramlld.dtos.UserDTO;
import com.example.instagramlld.model.User;
import com.example.instagramlld.model.UserFollow;
import com.example.instagramlld.repositories.FollowRepository;

import java.util.List;

/**
 * Created by shivam.si on 04/05/22 1:09 pm
 */

public class FollowService {
    FollowRepository followRepository = new FollowRepository();
    UserService userService = new UserService();
    public FollowDTO addUserFollow(User user1, User user2) {
        return getResponse(followRepository.addUserFollow(user1, user2));
    }

    private FollowDTO getResponse(UserFollow userFollow) {
        FollowDTO followDTO = new FollowDTO();
        followDTO.setFollowerName(userFollow.getFollower().getName());
        followDTO.setFoloweeName(userFollow.getFolowee().getName());
        return followDTO;
    }

    public FollowersFollowingDTO getFollowers(User user) {
        return getFollowerResponse(followRepository.getFollowers(user));
    }

    public FollowersFollowingDTO getFollowings(User user) {
        return getFollowingResponse(followRepository.getFollowings(user));
    }

    private FollowersFollowingDTO getFollowerResponse(List<UserFollow> followers) {
        FollowersFollowingDTO followersFollowingDTO = new FollowersFollowingDTO();
        for(UserFollow userFollow: followers) {
            User user = userFollow.getFollower();
            UserDTO userDTO = userService.getResponse(user);
            followersFollowingDTO.getUsers().add(userDTO);
        }
        return followersFollowingDTO;
    }

    private FollowersFollowingDTO getFollowingResponse(List<UserFollow> followers) {
        FollowersFollowingDTO followersFollowingDTO = new FollowersFollowingDTO();
        for(UserFollow userFollow: followers) {
            User user = userFollow.getFolowee();
            UserDTO userDTO = userService.getResponse(user);
            followersFollowingDTO.getUsers().add(userDTO);
        }
        return followersFollowingDTO;
    }
}
