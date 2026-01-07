package com.vikas.blogms.dto;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vikas.blogms.entity.Blog;

@Repository
public interface BlogRepo extends MongoRepository<Blog, String>{

}
