package com.example.instagramlld.dtos;

/**
 * Created by shivam.si on 04/05/22 1:09 pm
 */

public class FollowDTO {
    String followerName;
    String foloweeName;

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    public String getFoloweeName() {
        return foloweeName;
    }

    public void setFoloweeName(String foloweeName) {
        this.foloweeName = foloweeName;
    }

    @Override
    public String toString() {
        return "FollowDTO{" +
                "followerName='" + followerName + '\'' +
                ", foloweeName='" + foloweeName + '\'' +
                '}';
    }
}
