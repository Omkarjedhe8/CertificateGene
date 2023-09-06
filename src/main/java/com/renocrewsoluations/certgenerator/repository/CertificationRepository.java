package com.renocrewsoluations.certgenerator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsoluations.certgenerator.entity.Certification;

@Repository
public interface CertificationRepository  extends JpaRepository<Certification, Long> {

	Optional<Certification> findById(Long certiId);

	void deleteById(Long certiId);

	Certification save(Certification certification);

	
	
}
