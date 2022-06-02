package com.coobby.vo;

import java.io.File;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Entity
@Table(name="feed_image")
public class FeedImageVO {
	
	@Id
	@Column(name="fe_stored_image")
	private String feStoredImage;
	@Column(name="fe_origin_image")
	private String feOriginImage;
	@Column(name="fe_file_size")
	private int feFileSize;
	@Column(name="fe_seq")
	private int feSeq;
	@ManyToOne
	@JoinColumn(name= "fe_no")
	private FeedVO feed;
	
//	MultipartFile file;
//
//	public String getFeStoredImage() {
//		return feStoredImage;
//	}
//
//	public void setFeStoredImage(String feStoredImage) {
//		this.feStoredImage = feStoredImage;
//	}
//
//	public String getFeOriginImage() {
//		return feOriginImage;
//	}
//
//	public void setFeOriginImage(String feOriginImage) {
//		this.feOriginImage = feOriginImage;
//	}
//
//	public int getFeFileSize() {
//		return feFileSize;
//	}
//
//	public void setFeFileSize(int feFileSize) {
//		this.feFileSize = feFileSize;
//	}
//
//	public int getFeSeq() {
//		return feSeq;
//	}
//
//	public void setFeSeq(int feSeq) {
//		this.feSeq = feSeq;
//	}
//
//	public FeedVO getFeed() {
//		return feed;
//	}
//
//	public void setFeed(FeedVO feed) {
//		this.feed = feed;
//	}
//
//	public MultipartFile getFile() {
//		return file;
//	}
//	
//	public void setFile(MultipartFile file) {
//		this.file = file;
//		
//		// 파일 업로드 작업
//		if(!file.isEmpty()) {
//			this.feStoredImage = file.getOriginalFilename();
//			
//			// 실제 저장되는 파일명 만들기
//			UUID uuid = UUID.randomUUID();
//			feOriginImage = uuid.toString() + "" + feStoredImage;
//			
//			//저장 : file - 자바에서 파일과 디렉토리를 생성, 삭제, 관리하는 클래스
//			File f = new File("/resources/user/recipe/recipeimages" + feOriginImage);
//			try {
//				file.transferTo(f);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	

}
