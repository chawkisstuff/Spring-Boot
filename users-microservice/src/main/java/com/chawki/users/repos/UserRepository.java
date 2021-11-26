package com.chawki.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chawki.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> 
	{
		User findByUsername(String username);
	}