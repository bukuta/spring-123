package com.example.demo.dao;
import org.springframework.data.repository.PagingAndSortingRepository;


interface UserRepository extends PagingAndSortingRepository<User,Integer> {

}