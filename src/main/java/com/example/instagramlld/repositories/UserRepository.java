package com.example.instagramlld.repositories;

import com.example.instagramlld.model.User;
import org.springframework.stereotype.Component;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by shivam.si on 04/05/22 12:41 pm
 */
@Component
public class UserRepository {
    static Map<Long, User> users = new HashMap<>();
    {
        for(int i=0;i<10;i++) {
            User user = new User();
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
            users.put(user.getId(), user);
        }
    }

    public User getUser(long id) {
        return users.getOrDefault(id, null);
    }

    public User registerUser(User user) {
        users.put(user.getId(), user);
        return user;
    }
}
