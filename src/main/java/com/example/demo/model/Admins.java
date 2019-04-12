package com.example.demo.model;

import javax.persistence.*;

@Entity
@Cacheable
@Table(name = "admins")
public class Admins {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;

    @Column(name="user_name")
    private String userName;
    @Column(name="password")
    private String  password;
    @Column(name="email")
    private String  email ;
    @Column(name="phone")
    private String  phone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
