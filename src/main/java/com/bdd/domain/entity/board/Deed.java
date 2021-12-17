package com.bdd.domain.entity.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="deed")
@Data
@NoArgsConstructor
public class Deed {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int deed_idx;
	private int uid;
	private char is_used;
	
	@Builder
	public Deed(int deed_idx, int uid, char is_used) {
		super();
		this.deed_idx = deed_idx;
		this.uid = uid;
		this.is_used = is_used;
	}
}
