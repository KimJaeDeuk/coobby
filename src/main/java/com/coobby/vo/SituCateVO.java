package com.coobby.vo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CATE_SITU")
public class SituCateVO {
	
	@Id
	private String situ_name;
	
}
