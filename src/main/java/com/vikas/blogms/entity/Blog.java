package com.vikas.blogms.entity;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "blogs")
public class Blog {

	private String id;
	private String title;
	private String description;
	private Long authorId;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;

}
