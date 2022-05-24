package com.coobby.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CookVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cook_no;
	private int ingr_code;
	private String ingr_count;
	private int re_no;

}
