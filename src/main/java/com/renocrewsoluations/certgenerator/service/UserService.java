package com.renocrewsoluations.certgenerator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.renocrewsoluations.certgenerator.entity.User;
import com.renocrewsoluations.certgenerator.repository.UserRepository;

public class UserService {
	
	@Autowired
	  private final UserRepository userRepository;

	    
	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public List<User> getAllUser() {
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

		public List<User> getAllUsers() {
			// TODO Auto-generated method stub
			return null;
		}

}
