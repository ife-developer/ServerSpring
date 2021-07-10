package com.ife.develeper.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Objects;

@Entity
public class User {

    @javax.persistence.Id
    private @Id @GeneratedValue Long id;
    private String userLogin;
    private String userEmail;

    @JsonIgnore
    private String userPassHash;

    public User() {
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassHash() {
        return userPassHash;
    }

    public void setUserPassHash(String userPassHash) {
        this.userPassHash = userPassHash;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public User(Long id, String userLogin, String userEmail) {
        this.id = id;
        this.userLogin = userLogin;
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userLogin='" + userLogin + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(userLogin, user.userLogin) && Objects.equals(userEmail, user.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userLogin, userEmail);
    }
}
