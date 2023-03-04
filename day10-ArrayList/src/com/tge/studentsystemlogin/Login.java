package com.tge.studentsystemlogin;

public class Login {
    private String username;
    private String password;
    private String id;
    private String phoneNumber;

    public Login() {
    }

    public Login(String username, String password, String id, String phonenumber) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.phoneNumber = phonenumber;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhonenumber() {
        return phoneNumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phoneNumber = phonenumber;
    }
}
