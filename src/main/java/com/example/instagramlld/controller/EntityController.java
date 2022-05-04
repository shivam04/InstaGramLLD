package com.example.instagramlld.controller;

import com.example.instagramlld.dtos.EntityDTO;
import com.example.instagramlld.model.Entity;
import com.example.instagramlld.model.User;
import com.example.instagramlld.service.EntityService;

import java.util.List;

/**
 * Created by shivam.si on 04/05/22 1:34 pm
 */

public class EntityController {
    EntityService entityService = new EntityService();
    public EntityDTO addEntity(Entity entity) {
       return entityService.addEntity(entity);
    }

    public EntityDTO getEntity(long id) {
        return entityService.getEntity(id);
    }
}
