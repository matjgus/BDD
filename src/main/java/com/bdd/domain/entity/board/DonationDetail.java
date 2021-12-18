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
	private Long donation_idx;
	@Column(length = 30, nullable = false)
    private Long story_idx;
	@Column(length = 30, nullable = false)
    private String donor_uid;
	@Column(length = 30, nullable = false)
    private String donee_uid;
	@Column(length = 30, nullable = false)
    private int donation_count;

	@Builder
	public DonationDetail(Long donation_idx, int donation_count,Long story_idx, String donor_uid, String donee_uid) {
		super();
		this.story_idx = story_idx;
		this.donor_uid = donor_uid;
		this.donee_uid = donee_uid;
		this.donation_count = donation_count;
		this.donation_idx = donation_idx;
	}
}
