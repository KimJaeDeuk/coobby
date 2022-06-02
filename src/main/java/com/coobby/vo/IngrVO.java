package com.coobby.vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="INGR")
public class IngrVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ingr_code")
	private Integer ingrCode;
	@Column(name="ingr_name")
	private String ingrName;
	@Column(name="ingr_seasonal")
	private String ingrSeasonal;
	@Column(name="ingr_temp")
	private String ingrTemp;
	@Column(name="ingr_kcal")
	private String ingrKcal;
	@Column(name="ingr_best")
	private String ingrBest;
	@Column(name="ingr_wost")
	private String ingrWost;
	@Column(name="ingr_trim")
	private String ingrTrim;
	@Column(name="ingr_cooking")
	private String ingrCooking;
	@Column(name="ingr_storage")
	private String ingrStorage;
	@Column(name="ingr_origin_image")
	private String ingrOriginImage;
	@Column(name="ingr_stored_image")
	private String ingrStoredImage;
	@Column(name="ingr_file_size")
	private String ingrFileSize;
	
}
