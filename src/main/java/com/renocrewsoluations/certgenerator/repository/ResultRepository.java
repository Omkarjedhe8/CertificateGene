package com.renocrewsoluations.certgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.renocrewsoluations.certgenerator.entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

}
