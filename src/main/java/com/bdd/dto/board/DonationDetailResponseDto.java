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
	private Long donation_idx;
	private Long story_idx;
	private String donor_uid;
	private String donee_uid;
	private int donation_count;
	
	@Builder
	public DonationDetailResponseDto(DonationDetail entity) {
		this.story_idx = entity.getStory_idx();
		this.donation_idx = entity.getDonation_idx();
		this.donor_uid = entity.getDonor_uid();
		this.donee_uid = entity.getDonee_uid();
		this.donation_count = entity.getDonation_count();
	}
}
