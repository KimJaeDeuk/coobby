package com.coobby.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="chattingRoom")
public class ChattingVO {
	
	@Id
	@Column(name="room_number")
	private Integer roomNumber;
	
	@Column(name="room_name")
	private String roomName;
}
