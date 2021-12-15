package com.board.study.entity.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Entity(name="story")
@Data
public class StoryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long story_idx;
	private String story_title;
	private String story_content;
	private String story_id;
	private int num_donation;

}
