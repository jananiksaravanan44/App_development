package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Login {
    @Id
    @GeneratedValue
    private int userId;
    String email,password;
    @OneToOne
    @JsonManagedReference
    @JoinColumn(name = "userId")
    private Register register;

    public Login() {}

    public Login(int userId, String email, String password, Register register) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.register = register;
    }
   

    public int getUserId() {
        return register != null ? register.getUserId() : userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
}
