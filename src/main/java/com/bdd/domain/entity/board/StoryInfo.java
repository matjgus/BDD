package com.bdd.domain.entity.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="story")
@Data
@NoArgsConstructor
public class StoryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long story_idx;
	private String story_title;
	private String story_content;
	private String story_id;
	private int num_donation;	
	
	
	@Builder
	public StoryInfo(Long story_idx, String story_title, String story_content, String story_id, int num_donation) {
		super();
		this.story_idx=story_idx;
		this.story_title=story_title;
		this.story_content=story_content;
		this.story_id=story_id;
		this.num_donation=num_donation;
	}

}
