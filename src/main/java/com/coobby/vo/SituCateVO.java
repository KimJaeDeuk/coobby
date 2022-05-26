package com.coobby.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CATE_SITU")
public class SituCateVO {
	
	@Id
	@Column(name="situ_name")
	private String situName;
	
}
