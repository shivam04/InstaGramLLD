package com.example.instagramlld.dtos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shivam.si on 04/05/22 1:15 pm
 */

public class FollowersFollowingDTO {
    List<UserDTO> users = new ArrayList<>();

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "FollowersFollowingDTO{" +
                "users=" + users +
                '}';
    }
}
