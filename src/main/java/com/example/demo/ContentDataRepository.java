package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentDataRepository extends 
JpaRepository<ContentData,Long>{
//public List<UserData> findByName(String name);

	public List<ContentData> findByUser(UserData user);
}
