package com.bdd.dto.board;

import com.bdd.domain.entity.board.Donation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DonationResponseDto {
	private Long story_idx;
	private String donor_uid;
	private String donee_uid;
	private int donation_idx;
	
	public DonationResponseDto(Donation entity) {
		this.story_idx=entity.getStory_idx();
		this.donor_uid=entity.getDonor_uid();
		this.donee_uid=entity.getDonee_uid();
		this.donation_idx=entity.getDonation_idx();
	}
}
