package com.bdd.dto.board;

import com.bdd.domain.entity.board.Benefit;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BenefitResponseDto {
	private String id;
	private int uid;
	private char is_get10;
	private char is_get20;
	private char is_get30;
	
	public BenefitResponseDto(Benefit entity) {
		this.id = entity.getId();
		this.uid = entity.getUid();
		this.is_get10 = entity.getIs_get10();
		this.is_get20 = entity.getIs_get20();
		this.is_get30 = entity.getIs_get30();
	}
}
