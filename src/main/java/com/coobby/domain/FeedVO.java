package com.coobby.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class FeedVO {
	
	@Id
	private Integer fe_no;
	private String fe_title;
	private String fe_content;
	private String fe_regdate;
	private int fe_replycheck;
	private String mem_id;

}
