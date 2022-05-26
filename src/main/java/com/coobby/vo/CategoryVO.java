package com.coobby.vo;

import java.util.List;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cate_code")
	private Integer cateCode;
	
	@Column(name="cate_lev")
	private int cateLev;
	
	@Column(name="cate_name")
	private String cateName;
	
	@Column(name="cate_detail_lev")
	private int cateDetailLev;
	
	@Column(name="cate_parent_lev")
	private int cateParentLev;
	
	@Column(name="cate_detail_parent_lev")
	private int cateDetailParentLev;
	
	
}
