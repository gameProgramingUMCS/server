package com.zrzeda.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by mateusz on 04.08.14.
 */

@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @Column(name = "username")
    private String userName;

    @Column(name="password")
    private String password;

    public User() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
