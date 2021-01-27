package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDataRepository extends
JpaRepository<UserData, Long>{

	
	//↓↓↓--------------spring_security用に作成----------------↓↓↓

	public UserData findByMail(String mail);
	
}