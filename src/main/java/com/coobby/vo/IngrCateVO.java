package com.coobby.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CATE_INGR")
public class IngrCateVO {
	
	@Id
	@Column(name="ingr_name")
	private String ingrName;
	
}
