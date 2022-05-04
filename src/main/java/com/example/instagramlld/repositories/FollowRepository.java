package com.example.instagramlld.repositories;

import com.example.instagramlld.model.User;
import com.example.instagramlld.model.UserFollow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shivam.si on 04/05/22 1:10 pm
 */

public class FollowRepository {
    static Map<Long, List<UserFollow>> userFollowerData = new HashMap<>();
    static Map<Long, List<UserFollow>> userFollowingData = new HashMap<>();
    {

    }

    public UserFollow addUserFollow(User user1, User user2) {
        List<UserFollow> userFollowerList = userFollowerData.getOrDefault(user2.getId(), new ArrayList<>());
        List<UserFollow> userFollowingList = userFollowingData.getOrDefault(user1.getId(), new ArrayList<>());
        UserFollow userFollow = new UserFollow();
        userFollow.setFollower(user1);
        userFollow.setFolowee(user2);
        userFollowerList.add(userFollow);
        userFollowingList.add(userFollow);
        userFollowerData.put(user2.getId(), userFollowerList);
        userFollowingData.put(user1.getId(), userFollowingList);
        return userFollow;
    }

    public List<UserFollow> getFollowers(User user) {
        return userFollowerData.getOrDefault(user.getId(), new ArrayList<>());
    }

    public List<UserFollow> getFollowings(User user) {
        return userFollowingData.getOrDefault(user.getId(), new ArrayList<>());
    }
}
