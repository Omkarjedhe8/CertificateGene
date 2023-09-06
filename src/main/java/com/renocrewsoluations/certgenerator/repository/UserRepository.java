package com.renocrewsoluations.certgenerator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renocrewsoluations.certgenerator.entity.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findById(Long id);

	void deleteById(Long id);

	User save(User user);

	
}
