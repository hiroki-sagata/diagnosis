package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;




@Entity
public class ContentData {


//=================1:多の追加==================	

@ManyToOne

private UserData user;

public UserData getUser() {return user;}

public void setUser(UserData user) {this.user = user;}
//=================1:多の追加==================	





@Id
@GeneratedValue
private long id;
public long getId() {return id;}

public void setId(long id) {this.id = id;}



private String content;

public String getContent() {return content;}

public void setContent(String content) {this.content = content;}




}
