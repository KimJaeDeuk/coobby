package com.coobby.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class RecipeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer re_no;
	@Column(insertable=false, updatable=false, columnDefinition="date default (current_date)")
	@Temporal(TemporalType.DATE)
	private Date re_createtime;
	private String re_updatetime;
	private String re_title;
	private String re_content;
	private String re_tip;
	private String re_video_url;
	private String re_cook;
	private String mem_id;
	private String kind_name;
	private String situ_name;
	private String how_name;
	private String ingr_name;

}
