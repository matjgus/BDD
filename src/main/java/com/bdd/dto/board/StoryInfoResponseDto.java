package com.bdd.dto.board;

import java.time.LocalDate;

import com.bdd.domain.entity.board.StoryInfo;

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
	private LocalDate reg_date;
	private LocalDate fin_date;
	
	public StoryInfoResponseDto(StoryInfo entity) {
		this.story_idx=entity.getStory_idx();
		this.story_title=entity.getStory_title();
		this.story_content=entity.getStory_content();
		this.story_id=entity.getStory_id();
		this.num_donation=entity.getNum_donation();
		this.reg_date=entity.getReg_date();
		this.fin_date=entity.getFin_date();
	}
}