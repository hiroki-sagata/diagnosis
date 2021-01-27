package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class GoodButton {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

@Column
private long id;


@Column(nullable = false)
private long point;

public long getPoint() { return point; }
public void setPoint(long point) {this.point = point; }


public long getId() { return id; }
public void setId(long id) {this.id = id; }
}
