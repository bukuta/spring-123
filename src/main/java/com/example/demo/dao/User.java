package com.example.demo.dao;

// import javax.
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="admins")
public class User{
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;
}