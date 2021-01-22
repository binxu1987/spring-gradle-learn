package com.xubin.kafka.entity;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private Long id;

    private String content;

    private Date create;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }
}
