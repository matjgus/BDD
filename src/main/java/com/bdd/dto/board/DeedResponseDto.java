package com.bdd.dto.board;

import com.bdd.domain.entity.board.Deed;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeedResponseDto {
	private int deed_idx;
	private String id;
	private int uid;
	private char is_used;
	
	public DeedResponseDto(Deed entity) {
		this.deed_idx = entity.getDeed_idx();
		this.id = entity.getId();
		this.uid = entity.getUid();
		this.is_used = entity.getIs_used();
	}
}
