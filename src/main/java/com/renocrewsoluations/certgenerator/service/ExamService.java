package com.renocrewsoluations.certgenerator.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renocrewsoluations.certgenerator.entity.Exam;
import com.renocrewsoluations.certgenerator.repository.ExamRepository;


@Service
public class ExamService {

		  private  ExamRepository examRepository;
		  @Autowired
	    public ExamService( ExamRepository examRepository) {
	        this. examRepository =  examRepository;
	    }

	    public Iterable<Exam> getAllExam() {
	        return  examRepository.findAll();
	    }

	    public Optional<Exam> getExamById(Long examId) {
		  
			return examRepository.findById(examId);
	    }

    public Exam createExam( Exam exam){
	        return examRepository.saveAll(exam);
	    }
	    

	    public Exam updateExam(Exam exam) {
	        return examRepository.save(exam);
	    }

	    public boolean deleteExam(Long examId) {
	    	 examRepository.deleteById(examId);
			return false;
	    }

		public Exam saveAll(Exam exam) {
			// TODO Auto-generated method stub
			return null;
		}

		public Exam save(Exam exam) {
			// TODO Auto-generated method stub
			return null;
		}

	

	
	
}
