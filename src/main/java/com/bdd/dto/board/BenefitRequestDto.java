package com.bdd.dto.board;

import com.bdd.domain.entity.board.Benefit;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BenefitRequestDto {
	private String id;
	private int uid;
	private char is_get10;
	private char is_get20;
	private char is_get30;
	
	public Benefit toEntity() {
		return Benefit.builder()
				.id(id)
				.uid(uid)
				.is_get10(is_get10)
				.is_get20(is_get20)
				.is_get30(is_get30)
				.build();
	}
}
