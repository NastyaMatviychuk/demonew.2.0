package com.example.demonew.dao;

import com.example.demonew.repository.News;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsDAO extends CrudRepository <News, Integer> {

    List<News> findById (int id);

}