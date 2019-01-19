package com.codinhub.pmanagement.domain;


import org.omg.PortableInterceptor.ServerRequestInfo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;

    private String projectIdentifier;

    private String description;

    private Date startDate;
    private Date endDate;

    private Date createdAt;
    private Date updatedAt;

    public Project() {
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

}
