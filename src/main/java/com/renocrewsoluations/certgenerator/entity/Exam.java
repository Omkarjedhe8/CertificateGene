package com.renocrewsoluations.certgenerator.entity;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;


@Entity
@Table(name = "exams")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int examId;
	private String examName;
	private String examDescrption;
	private String examDuration;
	private Date attemptDate;
	
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Exam(int examId, String examName, String examDescrption, String examDuration, Date attemptDate) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examDescrption = examDescrption;
		this.examDuration = examDuration;
		this.attemptDate = attemptDate;
	}


	public int getExamId() {
		return examId;
	}


	public void setExamId(int examId) {
		this.examId = examId;
	}


	public String getExamName() {
		return examName;
	}


	public void setExamName(String examName) {
		this.examName = examName;
	}


	public String getExamDescrption() {
		return examDescrption;
	}


	public void setExamDescrption(String examDescrption) {
		this.examDescrption = examDescrption;
	}


	public String getExamDuration() {
		return examDuration;
	}


	public void setExamDuration(String examDuration) {
		this.examDuration = examDuration;
	}


	public Date getAttemptDate() {
		return attemptDate;
	}


	public void setAttemptDate(Date attemptDate) {
		this.attemptDate = attemptDate;
	}


	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + ", examDescrption=" + examDescrption
				+ ", examDuration=" + examDuration + ", attemptDate=" + attemptDate + "]";
	}
	
	
	
	
	

}
