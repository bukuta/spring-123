package com.example.demo.responses;

import java.util.List;

public class Pagable<T> {
    public Integer total;
    public List<T> items;
}