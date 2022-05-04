package com.example.instagramlld.dtos;

import com.example.instagramlld.model.EntityType;

/**
 * Created by shivam.si on 04/05/22 1:34 pm
 */

public class EntityDTO {
    String name; //name of the user
    EntityType entityType;
    String caption;
    double lng;
    double lat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "EntityDTO{" +
                "name='" + name + '\'' +
                ", entityType=" + entityType +
                ", caption='" + caption + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                '}';
    }
}
