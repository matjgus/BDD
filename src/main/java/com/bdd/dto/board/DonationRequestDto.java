package com.bdd.dto.board;

import javax.persistence.Id;

import com.bdd.domain.entity.board.Donation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DonationRequestDto {
	private Long story_idx;
	private String donor_uid;
	private String donee_uid;
	private int donation_idx;
	
	public Donation toEntity() {
		return Donation.builder()
				.story_idx(story_idx)
				.donor_uid(donor_uid)
				.donee_uid(donee_uid)
				.donation_idx(donation_idx)
				.build();
	}
	
}
