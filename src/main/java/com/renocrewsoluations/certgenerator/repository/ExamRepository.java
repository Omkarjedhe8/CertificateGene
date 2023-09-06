package com.renocrewsoluations.certgenerator.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renocrewsoluations.certgenerator.entity.Exam;

import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {

	Optional<Exam> findById(Long examId);

	void deleteById(Long examId);

	Exam save(Exam exam);

	

	 
}
