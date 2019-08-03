package com.topica.springbootorm.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLASSROOM")
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name= "COURSEID")
	private int courseId;
	
	@Column(name= "TEACHERID")
	private int teacherId;
	
	@Column(name= "KIDID")
	private int kidId;
	
	@Column(name= "STARTTIME")
	private Timestamp startTime;
	
	@Column(name= "STATUS")
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getKidId() {
		return kidId;
	}

	public void setKidId(int kidId) {
		this.kidId = kidId;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Classroom(int id, int courseId, int teacherId, int kidId, Timestamp startTime, int status) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.teacherId = teacherId;
		this.kidId = kidId;
		this.startTime = startTime;
		this.status = status;
	}

	public Classroom() {
		super();
	}

	@Override
	public String toString() {
		return "Classroom [id=" + id + ", courseId=" + courseId + ", teacherId=" + teacherId + ", kidId=" + kidId
				+ ", startTime=" + startTime + ", status=" + status + "]";
	}
	
	
}
