package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

	 //public Users findByUser_idAndUser_pw(String userId, String userPw);
	 // findByUser_idAndUser_pw 하니까 Invalid derived query! No property user found for type Users!
	 
}
