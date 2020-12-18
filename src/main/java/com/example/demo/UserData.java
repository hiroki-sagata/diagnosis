package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.NotNull;




@Entity
@Table
public class UserData {

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Column
@NotNull   //追加
private long id;

@Column(length = 20, nullable = false)
@NotNull //追加
@NotBlank(message="名前を入力してください")
private String name;


@Column(length = 50, nullable = true)
@Email
private String mail;

@Column(nullable = false)
@NotEmpty(message="パスワードを入力してください")
@Size(min = 6, max= 20)
private String pass;

public long getId(){ return id; }
public void setId(long id) { this.id = id; }

public String getName(){ return name; }
public void setName(String name) { this.name = name; }

public String getMail(){ return mail; }
public void setMail(String mail) { this.mail = mail; }

public String getPass(){ return pass; }
public void setPass(String pass) { this.pass = pass; }

public String toString() {
	  return "Person(Name: " + this.name + ")";
	}



}


