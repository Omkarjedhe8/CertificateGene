package com.renocrewsoluations.certgenerator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.renocrewsoluations.certgenerator.entity.User;
import com.renocrewsoluations.certgenerator.repository.UserRepository;

public class UserService {
	
	  private final UserRepository userRepository;

	    @Autowired
	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public Optional<User> getUserById(Long id) {
	        return userRepository.findById(id);
	    }

	    public User createUser(User user) {
	        return userRepository.save(user);
	    }

	    public User updateUser(User user) {
	        return userRepository.save(user);
	    }

	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }


}
