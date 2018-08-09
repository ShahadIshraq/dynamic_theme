package com.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected String username;
    protected String password;
    protected String headerColor;


    public User(String username, String password, String headerColor) {
        this.username = username;
        this.password = password;
        this.headerColor = headerColor;
    }

    public String getHeaderColor() {
        return headerColor;
    }

    public void setHeaderColor(String headerColor) {
        this.headerColor = headerColor;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        String ret = "{";
        ret += "\"id\":\""+Long.toString(id)+"\",";
        ret += "\"username\":\""+username+"\",";
        ret += "\"headerColor\":\""+headerColor+"\"}";
        return ret;
    }


    public User(){}

}