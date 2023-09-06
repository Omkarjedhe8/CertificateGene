package com.renocrewsoluations.certgenerator.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "exams")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examId;
    private String examName;
    private String examDescription;
    private String examDuration;
    private Date attemptDate;

    public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(Long examId, String examName, String examDescription, String examDuration, Date attemptDate) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examDescription = examDescription;
		this.examDuration = examDuration;
		this.attemptDate = attemptDate;
	}

	public Long getExamId() {
		return examId;
	}

	public void setExamId(Long examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamDescription() {
		return examDescription;
	}

	public void setExamDescription(String examDescription) {
		this.examDescription = examDescription;
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
		return "Exam [examId=" + examId + ", examName=" + examName + ", examDescription=" + examDescription
				+ ", examDuration=" + examDuration + ", attemptDate=" + attemptDate + "]";
	}

    
    
}	
	