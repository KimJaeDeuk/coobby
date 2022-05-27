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
@Table(name="COOK")
public class CookVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cook_no")
	private int cookNo;
	
	@Column(name="ingr_code")
	private int ingrCode;
	
	@Column(name="ingr_count")
	private String ingrCount;
	
	@Column(name="re_no")
	private Integer reNo;

}
