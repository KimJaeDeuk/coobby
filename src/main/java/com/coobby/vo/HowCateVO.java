package com.coobby.vo;

import javax.persistence.Column;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CATE_HOW")
public class HowCateVO {
	
	@Id
	@Column(name="how_name")
	private String howName;
	
}	
