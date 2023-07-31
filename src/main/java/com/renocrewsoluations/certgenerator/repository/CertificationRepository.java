package com.renocrewsoluations.certgenerator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsoluations.certgenerator.entity.Certification;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {
	
	 public Optional<Certification> findById(Long certiId);
	  public void deleteById(Long certiId);


}
