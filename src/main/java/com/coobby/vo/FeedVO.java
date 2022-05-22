package com.coobby.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Data;

@Data
@Entity
@Table(name="feed")
public class FeedVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer fe_no;
	private String fe_title;
	private String fe_content;
	
	@Column(insertable = false, updatable = false, columnDefinition = "date default (current_date)")
	@Temporal(TemporalType.DATE)
	private Date fe_regdate;
	private int fe_replycheck;
	private String mem_id;
	
}
