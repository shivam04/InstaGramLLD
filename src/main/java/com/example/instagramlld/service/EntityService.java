package com.example.instagramlld.service;

import com.example.instagramlld.dtos.EntityDTO;
import com.example.instagramlld.model.Entity;
import com.example.instagramlld.model.User;
import com.example.instagramlld.repositories.EntityRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shivam.si on 04/05/22 1:34 pm
 */

public class EntityService {
    EntityRepository entityRepository = new EntityRepository();
    public EntityDTO addEntity(Entity entity) {
        return getResponse(entityRepository.addEntity(entity));
    }

    public EntityDTO getEntity(long id) {
        return getResponse(entityRepository.getEntity(id));
    }

    public List<EntityDTO> getUserFeed(User user) {
        List<Entity> entities = entityRepository.getUserFeed(user);
        List<EntityDTO> entityDTOS = new ArrayList<>();
        for(Entity entity: entities) {
            entityDTOS.add(getResponse(entity));
        }
        return entityDTOS;
    }

    private EntityDTO getResponse(Entity entity) {
        EntityDTO entityDTO = new EntityDTO();
        entityDTO.setEntityType(entity.getEntityType());
        entityDTO.setName(entity.getUser().getName());
        entityDTO.setLat(entity.getLat());
        entityDTO.setLng(entity.getLng());
        entityDTO.setCaption(entity.getCaption());
        return entityDTO;
    }
}
