package com.bdd.dto.board;

import com.bdd.domain.entity.board.DonationDetail;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@lombok.ToString
public class DonationDetailRequestDto {
	private Long story_idx;
	private Long donation_idx;
	private String donor_uid;
	private String donee_uid;
	private int donation_count;

	public DonationDetail toEntity() {
		return DonationDetail.builder()
				.donation_idx(donation_idx)
				.donation_count(donation_count)
				.donee_uid(donee_uid)
				.donor_uid(donor_uid)
				.story_idx(story_idx)
				.build();
	}
	
}
