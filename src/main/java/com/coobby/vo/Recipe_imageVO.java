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
@Table(name="RECIPE_IMAGE")
public class Recipe_imageVO {
	@Id
	@Column(name="re_stored_image")
	private String reStoredImage;

	@Column(name="re_origin_image")
	private String reOriginImage;
	
	@Column(name="re_file_size")
	private Integer reFileSize;
	
	@Column(name="re_split")
	private Integer reSplit;
	
	@ManyToOne
    @JoinColumn(name="re_no")
	private RecipeVO recipeVO;
}
