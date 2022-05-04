package com.example.instagramlld.controller;

import com.example.instagramlld.dtos.FollowDTO;
import com.example.instagramlld.dtos.FollowersFollowingDTO;
import com.example.instagramlld.model.User;
import com.example.instagramlld.service.FollowService;

/**
 * Created by shivam.si on 04/05/22 1:04 pm
 */

public class FollowController {
    FollowService followService = new FollowService();
    public FollowDTO addUserFollow(User user1, User user2) {
        return followService.addUserFollow(user1, user2);
    }

    public FollowersFollowingDTO getFollowers(User user) {
        return followService.getFollowers(user);
    }

    public FollowersFollowingDTO getFollowings(User user) {
        return followService.getFollowings(user);
    }
}
