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
public class Re_commentVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int re_comm_no;
	private int re_no;
	private String mem_id;
	private String re_content;
	@Column(insertable=false, updatable=false, columnDefinition="date default (current_date)")
	private String re_comm_createtime;
	private String re_comm_updatetime;
	private int re_parent;

}
