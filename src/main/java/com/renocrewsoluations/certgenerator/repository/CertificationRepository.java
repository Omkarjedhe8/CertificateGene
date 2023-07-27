package com.renocrewsoluations.certgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.renocrewsoluations.certgenerator.entity.Certification;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {

}
