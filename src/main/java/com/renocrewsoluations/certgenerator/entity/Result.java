package com.renocrewsoluations.certgenerator.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "results")
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId;

 //   @ManyToOne
  //  @JoinColumn(name = "user_id")
    private User user;

   // @ManyToOne
   // @JoinColumn(name = "exam_id")
    private Exam exam;

    private int resultScore;
    private Date resultDate;
	
    public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(Long resultId, User user, Exam exam, int resultScore, Date resultDate) {
		super();
		this.resultId = resultId;
		this.user = user;
		this.exam = exam;
		this.resultScore = resultScore;
		this.resultDate = resultDate;
	}

	public Long getResultId() {
		return resultId;
	}

	public void setResultId(Long resultId) {
		this.resultId = resultId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
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
		return "Result [resultId=" + resultId + ", user=" + user + ", exam=" + exam + ", resultScore=" + resultScore
				+ ", resultDate=" + resultDate + "]";
	}
    
	
    
    


}