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
@Table(name="kind_cate")
public class CateKindVO {
	@Id
	@Column(name="kind_Code")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer kindCode;

	@Column(name="kind_name")
	private String kindName;

}
