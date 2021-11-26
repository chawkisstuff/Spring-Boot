package com.chawki.users.service;

import com.chawki.users.entities.Role;
import com.chawki.users.entities.User;
public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
