package com.example.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.NotNull;




@Entity
@Table(name="spring_test")
public class UserData{


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
@NotBlank
@Email(message="E-mailアドレスを入力してください")
private String mail;

@Column(nullable = false)
@NotBlank
//@Size(message="パスワードには6文字以上が必要です",min = 6, max= 20)
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
	  return "Person(Name: " + this.name + ")";}


//=================1:多の追加==================
@OneToMany(mappedBy = "user")
private List<ContentData> contentList;

public List<ContentData> getContentList() {
	return contentList;
	}
public void setContentList(List<ContentData> contentList) {
	this.contentList = contentList;}

//=================1:多の追加==================	

}


