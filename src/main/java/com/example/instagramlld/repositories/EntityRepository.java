package com.example.instagramlld.repositories;

import com.example.instagramlld.model.Entity;
import com.example.instagramlld.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shivam.si on 04/05/22 1:28 pm
 */

public class EntityRepository {
    static Map<Long, Entity> entities = new HashMap<>();
    static Map<Long, List<Entity>> userEntities = new HashMap<>();
    {

    }

    public Entity addEntity(Entity entity) {
        entities.put(entity.getId(), entity);
        List<Entity> entities = userEntities.getOrDefault(entity.getUser().getId(), new ArrayList<>());
        entities.add(entity);
        userEntities.put(entity.getUser().getId(), entities);
        return entity;
    }

    public Entity getEntity(long id) {
        return entities.get(id);
    }

    public List<Entity> getUserFeed(User user) {
        return  userEntities.getOrDefault(user.getId(), new ArrayList<>());
    }
}
