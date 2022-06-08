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
@Table(name="Situ_cate")
public class CateSituVO {
	@Id
	@Column(name="situ_Code")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer situCode;

	@Column(name="situ_name")
	private String situName;

}
