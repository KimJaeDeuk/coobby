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
@Table(name="ingr_cate")
public class CateIngrVO {
	@Id
	@Column(name="ingr_Code")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ingrCode;

	@Column(name="ingr_name")
	private String ingrName;
}