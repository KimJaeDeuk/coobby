package com.coobby.vo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CATE_INGR")
public class IngrCateVO {
	
	@Id
	private String ingr_name;
	
}
