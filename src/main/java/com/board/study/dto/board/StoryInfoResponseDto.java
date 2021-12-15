package com.board.study.dto.board;

import com.board.study.entity.board.StoryInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StoryInfoResponseDto {
	private Long story_idx;
	private String story_title;
	private String story_content;
	private String story_id;
	private int num_donation;
	
	public StoryInfoResponseDto(StoryInfo entity) {
		this.story_idx=entity.getStory_idx();
		this.story_title=entity.getStory_title();
		this.story_content=entity.getStory_content();
		this.story_id=entity.getStory_id();
		this.num_donation=entity.getNum_donation();
	}
}
