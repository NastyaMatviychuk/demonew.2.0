package com.example.demonew.dao;

import com.example.demonew.repository.Meeting;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MeetingDAO extends CrudRepository<Meeting, Integer> {

    List<Meeting> findAllById (int id);

}