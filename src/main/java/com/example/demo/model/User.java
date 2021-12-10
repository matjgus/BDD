package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false, length=30)
	private String username;
	@Column(nullable=false, length=100)	
	private String password;
	@Column(nullable=false, length=50)	
	private String email;
	@ColumnDefault("'user'")
	private String role;
	@CreationTimestamp
	private Timestamp createDate;
}
