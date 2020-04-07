package com.usochantest44.datatest.pojo;


import javax.persistence.*;
import java.io.Serializable;


public class uso implements Serializable {


    private String uid;

    private String name;


    public uso(){

    }

    public uso(String uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
