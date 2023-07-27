package com.renocrewsoluations.certgenerator.entity;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;


@Entity
@Table(name = "results")
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resultId;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User id;

	@OneToOne
	@JoinColumn(name="exam_id")
	private Exam examId;
	private int resultScore;
	private Date resultDate;
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Exam getExamId() {
		return examId;
	}



	public void setExamId(Exam examId) {
		this.examId = examId;
	}



	public Result(int resultId, User id, Exam examId, int resultScore, Date resultDate) {
		super();
		this.resultId = resultId;
		this.id = id;
		this.examId = examId;
		this.resultScore = resultScore;
		this.resultDate = resultDate;
	}



	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public User getId() {
		return id;
	}

	public void setId(User id) {
		this.id = id;
	}

	public int getResultScore() {
		return resultScore;
	}

	public void setResultScore(int resultScore) {
		this.resultScore = resultScore;
	}

	public Date getResultDate() {
		return resultDate;
	}

	public void setResultDate(Date resultDate) {
		this.resultDate = resultDate;
	}



	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", id=" + id + ", examId=" + examId + ", resultScore=" + resultScore
				+ ", resultDate=" + resultDate + "]";
	}

	
	
	

}
