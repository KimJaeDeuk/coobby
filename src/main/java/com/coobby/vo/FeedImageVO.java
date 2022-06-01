package com.coobby.vo;

import javax.persistence.Column;
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
	@Column(name="fe_stored_image")
	private String feStoredImage;
	@Column(name="fe_origin_image")
	private String feOriginImage;
	@Column(name="fe_file_size")
	private int feFileSize;
	@Column(name="fe_seq")
	private int feSeq;
	//private int fe_no;
	
	@ManyToOne
	@JoinColumn(name= "fe_no")
	private FeedVO feed;

}
