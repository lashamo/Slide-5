package com.learn.slide5.object;

import java.util.Random;

public class User {

    private String username;

    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return this.username.equals(user.getUsername()) && this.password.equals(user.getPassword());
    }

    @Override
    public int hashCode() {
        return username.hashCode() * password.hashCode();
    }

    @Override
    public String toString() {
        return username + " " + password;
    }
}
