package com.spring_boot.compras.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spring_boot.compras.entity.User;

public interface UserRepository extends CrudRepository<User,Long> {
	
	public User findByEmail(@Param("email") String email);

}
