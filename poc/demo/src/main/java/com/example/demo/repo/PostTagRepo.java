package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PostTag;
@Repository
public interface PostTagRepo extends CrudRepository<PostTag, Long> {

}
