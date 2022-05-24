package com.coobby.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="feed_image")
public class FeedImageVO {
	
	@Id
	private String fe_stored_image;
	private String fe_origin_image;
	private int fe_file_size;
	private int fe_seq;
	//private int fe_no;
	
	@ManyToOne
	@JoinColumn(name= "fe_no")
	private FeedVO feed;

}
