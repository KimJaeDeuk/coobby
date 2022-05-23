package com.coobby.vo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CATE_HOW")
public class HowCateVO {
	
	@Id
	private String how_name;
	
}	
