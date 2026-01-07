package com.vikas.blogms.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikas.blogms.dto.BlogRepo;
import com.vikas.blogms.entity.Blog;
import com.vikas.blogms.pojo.CreateBlogRequest;
import com.vikas.blogms.pojo.CreateBlogResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BlogServiceImpl {
	@Autowired
	private BlogRepo blogRepo;

	public CreateBlogResponse createBlog(CreateBlogRequest createBlogRequest) {
		Blog blog = new Blog();
		blog.setTitle(createBlogRequest.getTitle());
		// blog.setContent(createBlogRequest.getContent());
		blog.setAuthorId(createBlogRequest.getAuthorId());
		// blog.setCreatedAt(LocalDateTime.now());
		// blog.setUpdatedAt(LocalDateTime.now());

		Blog savedBlog = blogRepo.save(blog);
		log.debug("Blog created with id: {}", savedBlog.getId());

		CreateBlogResponse createBlogResponse = new CreateBlogResponse();
		createBlogResponse.setId(savedBlog.getId());
		// createBlogResponse.setMessage("Blog created successfully");
		return createBlogResponse;
	}
}
