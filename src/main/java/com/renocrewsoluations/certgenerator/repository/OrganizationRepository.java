package com.renocrewsoluations.certgenerator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.renocrewsoluations.certgenerator.entity.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {

	 public Optional<Exam> findByexamId(Long examId);
		
	public Exam deleteByexamId(Long examId);	
	 
}
