package com.coobby.vo;


import javax.persistence.Column;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="category")
public class CategoryVO {

	
	@Id
	@Column(name="cate_code")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cateCode;
	
	@Column(name="cate_lev")
	private Integer cateLev;
	
	@Column(name="cate_name")
	private String cateName;
	
	@Column(name="cate_detail_lev")

	private Integer cateDetaillev;
	
	@Column(name="cate_parent_lev")
	private Integer cateParentlev;
	
	@Column(name="cate_detail_parent_lev")
	private Integer cateDetailParentlev;
	
}	
