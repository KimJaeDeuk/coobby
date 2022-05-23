package com.coobby.vo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CATE_KIND")
public class KindCateVO {
	
	@Id
	@Column(name="kind_name")
	private String kindName;
	
}
