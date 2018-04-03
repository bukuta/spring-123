package com.example.demo.dao;

// import javax.
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class User{
    @JsonProperty("_id")
    public Integer id;
    @JsonProperty("_name")
    public String name;
}