package com.coobby.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BoardImage")
public class BoardImageVO {
	
	@Id
	@Column(length = 150, name="b_stored_image")
	private String bStoredImage;
	@Column(length = 100, name="b_origin_image")
	private String bOriginImage;
	@Column(name = "b_file_size")
	private Integer bFileSize;
	@Column(name = "b_seq")
	private Integer bSeq;
	@Column(name = "board_no")
	private Integer boardNo;
	
	
}
