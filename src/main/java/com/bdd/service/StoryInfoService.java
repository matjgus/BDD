package com.bdd.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bdd.dto.board.StoryInfoRequestDto;
import com.bdd.dto.board.StoryInfoResponseDto;
import com.bdd.domain.entity.board.StoryInfo;
import com.bdd.domain.entity.board.StoryInfoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StoryInfoService {
	private final StoryInfoRepository storyInfoRepository;
	
	@Transactional
	public Long save(StoryInfoRequestDto requestDto) {
		return storyInfoRepository.save(requestDto.toEntity()).getStory_idx();
	}
	
	@Transactional
	public List<StoryInfoResponseDto> findAll(){
		List<StoryInfo> entityList = storyInfoRepository.findAll();
		List<StoryInfoResponseDto> storyInfoList = new ArrayList<StoryInfoResponseDto>();
		
		for(int i = 0; i<entityList.size();i++) {
			storyInfoList.add(new StoryInfoResponseDto(entityList.get(i)));
		}
		return storyInfoList;
	}
	
	@Transactional
	public Long deleteById(Long story_idx) {
		storyInfoRepository.deleteById(story_idx);
		return story_idx;
	}
	
}
