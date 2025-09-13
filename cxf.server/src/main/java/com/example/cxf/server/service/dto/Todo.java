package com.example.cxf.server.service.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo implements Serializable {

    private String todoId;

    private String title;

    private String description;

    private boolean finished;

    private Date createdAt;

    // omitted setter and getter

}