package com.example.instagramlld.model;

/**
 * Created by shivam.si on 04/05/22 12:38 pm
 */

public class UserFollow {
    User follower;
    User folowee;

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public User getFolowee() {
        return folowee;
    }

    public void setFolowee(User folowee) {
        this.folowee = folowee;
    }
}
