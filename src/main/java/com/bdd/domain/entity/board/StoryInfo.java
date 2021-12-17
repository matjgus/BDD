package com.bdd.domain.entity.board;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bdd.domain.entity.BaseTimeEntity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="story")
@Data
@NoArgsConstructor
public class StoryInfo extends BaseTimeEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long story_idx;
	private String story_title;
	private String story_content;
	private String story_id;
	private int num_donation;	

	private LocalDate reg_date;
	private LocalDate fin_date;
	
	@Builder
	public StoryInfo(Long story_idx, String story_title, String story_content, String story_id, int num_donation, LocalDate reg_date, LocalDate fin_date) {
		super();
		this.story_idx = story_idx;
		this.story_title = story_title;
		this.story_content = story_content;
		this.story_id = story_id;
		this.num_donation = num_donation;
		this.reg_date = reg_date;
		this.fin_date = fin_date;
	}

}
