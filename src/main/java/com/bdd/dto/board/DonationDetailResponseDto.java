package com.bdd.dto.board;

import com.bdd.domain.entity.board.DonationDetail;

import groovy.transform.builder.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DonationDetailResponseDto {
	private Long donationIdx;
	private Long story_idx;
	private String donorUid;
	private String doneeUid;
	private int donationCount;
	
	@Builder
	public DonationDetailResponseDto(DonationDetail entity) {
		this.donationIdx = entity.getDonationIdx();
		this.story_idx = entity.getStory_idx();
		this.donorUid = entity.getDonorUid();
		this.doneeUid = entity.getDoneeUid();
		this.donationCount = entity.getDonationCount();
	}
}
