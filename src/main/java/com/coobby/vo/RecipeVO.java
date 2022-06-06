package com.coobby.vo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name="recipe")
public class RecipeVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="re_no")
	private Integer reNo;
	
//	@CreatedDate
//	@DateTimeFormat(pattern="yyyy-MM-dd")
//	@Column(insertable=false, updatable=false, columnDefinition="DATE DEFAULT (current_date)", name="re_createtime")
//	@Temporal(TemporalType.DATE)
	@Column(name="re_createtime")
	private String reCreatetime;

	@Column(name="re_updatetime")
	private String reUpdatetime;

	@Column(name="re_title")
	private String reTitle;

	@Column(name="re_content")
	private String reContent;

	@Column(name="re_tip")
	private String reTip;

	@Column(name="re_video_url")
	private String reVideoUrl;
	
	@Column(name="re_viewcnt")
	private Integer reViewcnt;

	@Column(name="re_cook")
	private String reCook;

	@ManyToOne
	@JoinColumn(name="mem_id")
	private MemberVO memberVO;
	
	@ManyToOne
	@JoinColumn(name="situ_code")
	private CateSituVO cateSituVO;
	
	@ManyToOne
	@JoinColumn(name="ingr_code")
	private CateIngrVO cateIngrVO;
	
	@ManyToOne
	@JoinColumn(name="kind_code")
	private CateKindVO cateKindVO;
	
	@ManyToOne
	@JoinColumn(name="how_code")
	private CateHowVO cateHowVO;

	@OneToMany(mappedBy ="recipeVO")
	List<Recipe_imageVO> recipe_imageVO;
	
//	@PrePersist
//    public void reCreatetime() {
//        this.reCreatetime = LocalDate.now();
//    }


	    
	

}
