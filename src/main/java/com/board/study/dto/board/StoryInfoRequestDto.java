package com.board.study.dto.board;

import java.time.LocalDate;

import com.board.study.entity.board.StoryInfo;

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
	
	private LocalDate fin_date;
	private LocalDate reg_date;
	
	public StoryInfo toEntity() {
		return StoryInfo.builder()
				.story_title(story_title)
				.story_content(story_content)
				.story_id(story_id)
				.build();
		
	}
}
