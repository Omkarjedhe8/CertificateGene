package com.renocrewsoluations.certgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renocrewsoluations.certgenerator.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
