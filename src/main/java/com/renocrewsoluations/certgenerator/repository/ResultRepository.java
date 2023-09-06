package com.renocrewsoluations.certgenerator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renocrewsoluations.certgenerator.entity.Result;



import org.springframework.stereotype.Repository;



@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

	void deleteByResultId(Long resultId);

	Optional<Result> findByResultId(Long resultId);

	Result save(Result result);

	
}
