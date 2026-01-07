package com.vikas.blogms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikas.blogms.pojo.CreateBlogRequest;
import com.vikas.blogms.pojo.CreateBlogResponse;
import com.vikas.blogms.service.BlogServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BlogController {


	@Autowired
	private BlogServiceImpl blogServiceImpl;

	@PostMapping("/createblog")
	public CreateBlogResponse createBlog(@RequestBody CreateBlogRequest createBlogRequest) {
		long currentTime = System.currentTimeMillis();
		try {
			return blogServiceImpl.createBlog(createBlogRequest);
		} finally {
			log.debug("Time Taken to create blog: {}", System.currentTimeMillis() - currentTime);
		}
	}

    @GetMapping("blogms/api/v1/blogs")
    public void getAllBlogs(){
        long currentTime = System.currentTimeMillis();
        
    }
}
