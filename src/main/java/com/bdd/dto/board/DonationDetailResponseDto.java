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
	private Long storyIdx;
	private String donorUid;
	private String doneeUid;
	private int donationCount;
	
	@Builder
	public DonationDetailResponseDto(DonationDetail entity) {
		this.donationIdx = entity.getDonationIdx();
		this.storyIdx = entity.getStoryIdx();
		this.donorUid = entity.getDonorUid();
		this.doneeUid = entity.getDoneeUid();
		this.donationCount = entity.getDonationCount();
	}
}
