package com.bdd.domain.entity.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity(name="benefit")
@Data
@NoArgsConstructor
public class Benefit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private int uid;
	private char is_get10;
	private char is_get20;
	private char is_get30;
	
	@Builder
	public Benefit(String id, int uid, char is_get10, char is_get20, char is_get30) {
		super();
		this.id = id;
		this.uid=uid;
		this.is_get10 = is_get10;
		this.is_get20 = is_get20;
		this.is_get30 = is_get30;
	}
}
