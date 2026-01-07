package com.vikas.blogms.pojo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateBlogResponse {

	private String id;
	private String title;
	private String description;
	private Long authorId;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;
	
	private boolean success;
}
