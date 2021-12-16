package com.bdd.dto.board;

import java.time.LocalDate;

import com.bdd.domain.entity.board.StoryInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StoryInfoRequestDto {
	private Long story_idx;
	private String story_title;
	private String story_content;
	private String story_id;
	private int num_donation;
	
	private LocalDate reg_date;
	private LocalDate fin_date;
	
	
	public StoryInfo toEntity() {
		return StoryInfo.builder()
				.story_idx(story_idx)
				.story_title(story_title)
				.story_content(story_content)
				.story_id(story_id)
				.num_donation(num_donation)
				.reg_date(reg_date)
				.fin_date(fin_date)
				
				.build();
	}
}