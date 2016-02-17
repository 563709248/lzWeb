package com.lz.entity;

import org.springframework.util.StringUtils;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.UUID;

/**
 * Created by Maven on 2016/2/17.
 */
@MappedSuperclass
public class IdEntity {

    private String id;

    @PrePersist
    public void prePersist() {
        if (StringUtils.isEmpty(this.id)) {
            this.id = UUID.randomUUID().toString();
        }
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
