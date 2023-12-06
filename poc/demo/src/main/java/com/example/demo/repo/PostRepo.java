package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Post;
@Repository
public interface PostRepo extends CrudRepository<Post, Long>{

}
