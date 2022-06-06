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
@Table(name="how_cate")
public class CateHowVO {
	@Id
	@Column(name="how_Code")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer howCode;

	@Column(name="how_name")
	private String howName;
}
