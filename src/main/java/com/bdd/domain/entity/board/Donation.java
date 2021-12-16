package com.bdd.domain.entity.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="donation")
@Data
@NoArgsConstructor
public class Donation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long story_idx;
	private String donor_uid;
	private String donee_uid;
	private int donation_idx;
	
	@Builder
	public Donation(Long story_idx, String donor_uid, String donee_uid, int donation_idx) {
		super();
		this.story_idx =  story_idx;
		this.donor_uid = donor_uid;
		this.donee_uid = donee_uid;
		this.donation_idx = donation_idx;
	}

}
