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

		try {
			log.debug("createBell:: createBlogRequest: {}", createBlogRequest);
			Blog newBlog = Blog.builder().authorId(createBlogRequest.getAuthorId()).title(createBlogRequest.getTitle())
					.description(createBlogRequest.getDesc()).createdDate(LocalDateTime.now()).build();
			blogRepo.save(newBlog);

			return CreateBlogResponse.builder().authorId(newBlog.getAuthorId()).createdDate(newBlog.getCreatedDate())
					.description(newBlog.getDescription()).title(newBlog.getTitle()).id(newBlog.getId()).build();

		} catch (Exception e) {
			log.error("Error", e.getClass(), e.getLocalizedMessage(), e);
			return CreateBlogResponse.builder().success(false).build();
		}
	}
}
