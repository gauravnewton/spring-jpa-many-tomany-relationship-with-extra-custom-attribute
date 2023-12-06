package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Post;
import com.example.demo.entity.Tag;
import com.example.demo.repo.PostRepo;
import com.example.demo.repo.TagRepo;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private TagRepo tagRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		
		Tag tag = new Tag("nimesh");
		tag = tagRepo.save(tag);

		Post post = new Post("Engineer");
		post = postRepo.save(post);
		post.addTag(tag);
		post = postRepo.save(post);

	}

}
