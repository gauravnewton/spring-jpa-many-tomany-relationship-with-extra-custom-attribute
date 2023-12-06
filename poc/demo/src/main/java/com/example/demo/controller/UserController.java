package com.example.demo.controller;

import java.awt.print.Book;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Post;
import com.example.demo.repo.PostRepo;
import com.example.demo.repo.TagRepo;

@RestController
@RequestMapping("/api/v1/book")
public class UserController {
    @Autowired
    PostRepo postRepo;
    @Autowired
    TagRepo tagRepo;
    
//    @PostMapping("/create")
//    public Book createUser(@RequestBody Book user) {
//        return userRepo.save(user);
//    }

    @GetMapping("/{postId}")
    public Post getUser(@PathVariable Long postId) {
        Optional<Post> post = postRepo.findById(postId);
        System.out.println("Sdfsdfdsfdsfd");
        return post.get();
    }
}
