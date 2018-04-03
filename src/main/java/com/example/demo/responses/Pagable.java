package com.example.demo.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagable<T> {
    @JsonProperty("total")
    public Integer total;
    public List<T> items;
}