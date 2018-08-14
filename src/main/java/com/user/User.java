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
    public User(String username, String password, String colors) {
        this.username = username;
        this.password = password;
        this.colors = colors;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected String username;
    protected String password;

    protected String colors;



    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
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
        ret += "\"colors\":\""+colors+"\"}";
        return ret;
    }


    public User(){}

}