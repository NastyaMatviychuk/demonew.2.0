package com.example.demonew.repository;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "user", catalog = "lib")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "U_name")
    private String name;
    @Column(name = "U_surname")
    private String surname;
    @Column(name = "U_username")
    private String username;
    @Column(name = "U_password")
    private String password;
    @Column(name = "U_email")
    private String email;
    @Column(name = "U_birthday")
    private String birthday;
    @Column(name = "U_phone")
    private String phone;
    @Column(name = "U_street")
    private String street;
    @Column(name = "U_house")
    private String house;
    @Column(name = "U_flat")
    private int flat;
public User(){}
    public User(String name, String surname, String username, String password, String email, String birthday, String phone, String street, String house, int flat) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
        this.phone = phone;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
}