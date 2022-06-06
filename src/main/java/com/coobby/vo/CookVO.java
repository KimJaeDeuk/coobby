package com.coobby.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="COOK")
public class CookVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cook_no")
	private Integer cookNo;
	
	@ManyToOne
	@JoinColumn(name="ingr_code")
	private IngrVO ingrVO;
	
	@Column(name="ingr_count")
	private String ingrCount;
	
	@ManyToOne
	@JoinColumn(name="re_no")
	private RecipeVO recipeVO;

}
