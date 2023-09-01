package com.renocrewsoluations.certgenerator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsoluations.certgenerator.entity.Exam;
import com.renocrewsoluations.certgenerator.entity.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Exam, Long> {

	 public Optional<Exam> findByexamId(Long examId);
		
	public Exam deleteByexamId(Long examId);

	public Organization save(Organization organization);

public Organization saveAll(Organization organization);

	//public Organization save(Organization organization);		 
}
