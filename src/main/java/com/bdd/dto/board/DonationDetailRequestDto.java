package com.bdd.dto.board;

import com.bdd.domain.entity.board.DonationDetail;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DonationDetailRequestDto {
	private Long story_idx;
	private String donor_uid;
	private String donee_uid;
	private int donation_count;
	
	public DonationDetail toEntity() {
		return DonationDetail.builder()
				.story_idx(story_idx)
				.donor_uid(donor_uid)
				.donee_uid(donee_uid)
				.donation_count(donation_count)
				.build();
	}
}
