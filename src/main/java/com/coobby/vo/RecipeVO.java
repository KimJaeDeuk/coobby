package com.coobby.vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="RECIPE")
public class RecipeVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="re_no")
	private Integer reNo;
	
	@Column(insertable=false, updatable=false, columnDefinition="date default (current_date)", name="re_createtime")
	private String reCreatetime;
	
	@Column(name="re_updatetime")
	private String reUpdatetime;
	
	@Column(name="re_title")
	private String reTitle;
	
	@Column(name="re_content")
	private String reContent;
	
	@Column(name="re_tip")
	private String reTip;
	
	@Column(name="re_video_url")
	private String reVideoUrl;
	
	@Column(name="re_cook")
	private String reCook;
	
	@Column(name="mem_id")
	private String memId;
	
	@ManyToOne
	@JoinColumn(name="cate_code")
	private CategoryVO categoryVO;
	
	@OneToMany(mappedBy ="recipeVO")
	List<Recipe_imageVO> recipe_imageVO;

}
