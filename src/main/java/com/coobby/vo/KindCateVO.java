package com.coobby.vo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CATE_KIND")
public class KindCateVO {
	
	@Id
	private String kind_name;
	
}
