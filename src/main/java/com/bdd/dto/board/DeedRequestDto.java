package com.bdd.dto.board;

import com.bdd.domain.entity.board.Deed;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeedRequestDto {
	private int deed_idx;
	private int uid;
	private char is_used;
	
	public Deed toEntity() {
		return Deed.builder()
				.deed_idx(deed_idx)
				.uid(uid)
				.is_used(is_used)
				.build();
	}
}
