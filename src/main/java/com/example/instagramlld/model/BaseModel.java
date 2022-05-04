package com.example.instagramlld.model;

import java.util.Date;

/**
 * Created by shivam.si on 04/05/22 12:35 pm
 */

public abstract class BaseModel {
    long id;
    Date createdAt;
    Date updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
