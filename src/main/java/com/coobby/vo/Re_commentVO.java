package com.coobby.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="RE_COMMENT")
public class Re_commentVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="re_comm_no")
	private int reCommNo;
	
	@Column(name="re_no")
	private int reNo;
	
	@Column(name="mem_id")
	private String memId;
	
	@Column(name="re_content")
	private String reContent;
	
	@Column(insertable=false, updatable=false, columnDefinition="date default (current_date)", name="re_comm_createtime")
	private String reCommCreatetime;
	
	@Column(name="re_comm_updatetime")
	private String re_comm_updatetime;
	
	@Column(name="re_parent")
	private int reParent;

}
