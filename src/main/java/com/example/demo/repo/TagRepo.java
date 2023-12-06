package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tag;
@Repository
public interface TagRepo extends CrudRepository<Tag, Long>{

}
