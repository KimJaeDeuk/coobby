package com.coobby.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "QnA")
public class QnAVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "qna_no")
	private Integer qnaNo;
	
	@Column(length = 100, name = "q_title")
	private String qTitle;
	@Column(length = 1000, name = "q_content")
	private String qContent;
	@Column(name = "q_check")
	private Integer qCheck;
	@Column(name = "q_date")
	private Date qDate;
	@Column(length = 1000, name = "a_content")
	private String aContent;
	@Column(name = "a_check")
	private Integer aCheck;
	@Column(name = "a_date")
	private Date aDate;
	@Column(length = 30, name = "mem_id")
	private String memId;
	
	
}
