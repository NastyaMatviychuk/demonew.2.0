package com.example.demonew.dao;

import com.example.demonew.repository.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDAO extends CrudRepository<User, Integer> {

    List<User> findAllById (int id);

}