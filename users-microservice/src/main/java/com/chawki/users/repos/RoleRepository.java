package com.chawki.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chawki.users.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long> 
	{
		Role findByRole(String role);
	}