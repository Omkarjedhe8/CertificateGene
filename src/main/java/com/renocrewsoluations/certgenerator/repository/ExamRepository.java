package com.renocrewsoluations.certgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.renocrewsoluations.certgenerator.entity.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {

}
