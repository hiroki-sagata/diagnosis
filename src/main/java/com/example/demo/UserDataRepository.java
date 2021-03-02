package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDataRepository extends
JpaRepository<UserData, Long>{
	
	//↓↓↓--------------mysql接続用に作成----------------↓↓↓

public interface UserRepository extends CrudRepository<UserData,Long>{}
	
	
	
	
	//↓↓↓--------------spring_security用に作成----------------↓↓↓

	public UserData findByMail(String mail);


	
}