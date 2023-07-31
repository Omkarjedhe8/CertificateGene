package com.renocrewsoluations.certgenerator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsoluations.certgenerator.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	 public Optional<User> findById(Long id);
	  public void deleteById(Long id);
			   
}
