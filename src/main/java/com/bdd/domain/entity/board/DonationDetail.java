package com.bdd.domain.entity.board;

import javax.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="donation_detail")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class DonationDetail {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "donation_idx",length = 30, nullable = false)
	private Long donationIdx;
	@Column(name = "story_idx",length = 30, nullable = false)
    private Long story_idx;
	@Column(name = "donor_uid", length = 30, nullable = false)
    private String donorUid;
	@Column(name = "donee_uid", length = 30, nullable = false)
    private String doneeUid;
	@Column(name = "donation_count", length = 30, nullable = false)
    private int donationCount;

	@Builder
	public DonationDetail(Long donationIdx, Long story_idx, String donorUid, String doneeUid, int donationCount) {
		super();
		this.donationIdx = donationIdx;
		this.story_idx = story_idx;
		this.donorUid = donorUid;
		this.doneeUid = doneeUid;
		this.donationCount = donationCount;
	}
}
