package com.example.demonew.dao;


import com.example.demonew.repository.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookDAO extends CrudRepository<Book, Integer> {

   List<Book> findAllById (int id);

}
