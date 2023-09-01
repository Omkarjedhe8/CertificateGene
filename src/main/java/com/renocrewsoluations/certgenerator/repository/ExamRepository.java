package com.renocrewsoluations.certgenerator.repository;

import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsoluations.certgenerator.entity.Exam;
//import com.renocrewsoluations.certgenerator.entity.Organization;

@Repository
public interface ExamRepository extends CrudRepository<Exam, Long> {

	 public Optional<Exam> findByexamId(Long examId);
		
	public Exam deleteByexamId(Long examId);

	public Exam saveAll(Exam exam);	
	
	//public Exam save(Exam exam);

	 
}
