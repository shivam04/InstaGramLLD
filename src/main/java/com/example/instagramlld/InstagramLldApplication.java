package com.example.instagramlld;

import com.example.instagramlld.controller.EntityController;
import com.example.instagramlld.controller.FollowController;
import com.example.instagramlld.controller.UserController;
import com.example.instagramlld.model.Entity;
import com.example.instagramlld.model.EntityType;
import com.example.instagramlld.model.User;
import com.example.instagramlld.repositories.UserRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InstagramLldApplication {

    public static void main(String[] args) {
        UserController userController = new UserController();
        EntityController entityController = new EntityController();
        FollowController followController = new FollowController();
        UserRepository userRepository = new UserRepository();

        User user = new User();
        int i = 10;
        user.setId(i);
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        user.setUserName("username-"+i);
        user.setName("FirstName-"+i+" "+"LastName-"+i);
        user.setEmail("email-"+i+"@email.com");
        try {
            String sDate1="31/12/1998";
            user.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse(sDate1));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setPassword("password-"+i);
        System.out.println(userController.getUser(1));
        System.out.println(userController.registerUser(user));
        System.out.println(userController.getUser(i));

        System.out.println(followController.addUserFollow(userRepository.getUser(1), userRepository.getUser(3)));
        System.out.println(followController.addUserFollow(userRepository.getUser(1), userRepository.getUser(2)));
        System.out.println(followController.addUserFollow(userRepository.getUser(3), userRepository.getUser(2)));

        System.out.println(followController.getFollowers(userRepository.getUser(2)));
        System.out.println(followController.getFollowers(userRepository.getUser(3)));
        System.out.println(followController.getFollowings(userRepository.getUser(1)));

        Entity entity = new Entity();
        entity.setId(1);
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());
        entity.setLocation("https://cdn.data.com/1");
        entity.setLat(11.23);
        entity.setLng(23.11);
        entity.setEntityType(EntityType.PHOTO);
        entity.setCaption("New Look");
        entity.setUser(userRepository.getUser(3));

        Entity entity1 = new Entity();
        entity1.setId(2);
        entity1.setCreatedAt(new Date());
        entity1.setUpdatedAt(new Date());
        entity1.setLocation("https://cdn.data.com/2");
        entity1.setLat(33.54);
        entity1.setLng(54.33);
        entity1.setEntityType(EntityType.VIDEO);
        entity1.setCaption("Fun Boating");
        entity1.setUser(userRepository.getUser(1));

        Entity entity2 = new Entity();
        entity2.setId(3);
        entity2.setCreatedAt(new Date());
        entity2.setUpdatedAt(new Date());
        entity2.setLocation("https://cdn.data.com/3");
        entity2.setLat(43.33);
        entity2.setLng(33.43);
        entity2.setEntityType(EntityType.PHOTO);
        entity2.setCaption("New Pic");
        entity2.setUser(userRepository.getUser(1));

        System.out.println(entityController.addEntity(entity));
        System.out.println(entityController.addEntity(entity1));
        System.out.println(entityController.addEntity(entity2));
        System.out.println(entityController.getEntity(1));
        System.out.println(entityController.getEntity(2));
        System.out.println(userController.getUserFeed(userRepository.getUser(1)));
        System.out.println(userController.getUserFeed(userRepository.getUser(2)));
        System.out.println(userController.getUserFeed(userRepository.getUser(3)));
    }

}
