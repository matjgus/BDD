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
	private Long donationIdx;
	private Long story_idx;
	private String donorUid;
	private String doneeUid;
	private int donation_count;
	
	public DonationDetail toEntity() {
		return DonationDetail.builder()
				.donationIdx(donationIdx)
				.story_idx(story_idx)
				.donorUid(donorUid)
				.doneeUid(doneeUid)
				.donationCount(donation_count)
				.build();
	}
	
}
