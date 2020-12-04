package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.jpaRepository;

@Repository
public interface UserDataRepository extends jpaRepository<UserData,Long>{

}
