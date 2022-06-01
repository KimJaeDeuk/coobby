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
@Table(name = "Scrap")
public class ScrapVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "scrap_no")
	private Integer ScrapNo;
	
	@Column(length = 30, name = "mem_id")
	private String MemId;
	@Column(name = "re_no")
	private Integer Reno;
	
	
}