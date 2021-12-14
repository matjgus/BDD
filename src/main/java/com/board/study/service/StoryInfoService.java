package com.board.study.service;

import org.springframework.stereotype.Service;

import com.board.study.dto.board.StoryInfoDto;
import com.board.study.entity.board.StoryInfo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StoryInfoService {
	final StoryInfoDomainService storyInfoDomainService;
	
	public StoryInfoService(StoryInfoDomainService storyInfoDomainService) {
		this.storyInfoDomainService = storyInfoDomainService;
	}
	public StoryInfoDto selectStoryInfo(String name) {
		StoryInfo storyInfo = storyInfoDomainService.getStoryInfo(name);
		StoryInfoDto storyInfoDto = new StoryInfoDto();
		storyInfoDto.setId(storyInfo.getId());
		storyInfoDto.setName(storyInfo.getName());
		storyInfoDto.setAge(storyInfo.getAge());
		
		return storyInfoDto;
	}
	public StoryInfoDto createStoryInfo(StoryInfoDto storyInfoDto) {
		StoryInfo storyInfo = new StoryInfo();
		log.debug("userStoryDto.getId():"+storyInfoDto.getId());
		storyInfo.setId(storyInfo.getId());
		storyInfo.setName(storyInfo.getName());
		storyInfo.setAge(storyInfo.getAge());
		
		storyInfo = storyInfoDomainService.createStoryInfo(storyInfo);
		
		storyInfoDto.setId(storyInfo.getId());
		storyInfoDto.setName(storyInfo.getName());
		storyInfoDto.setAge(storyInfo.getAge());
		
		return storyInfoDto;
	}
	
	public StoryInfoDto updateStoryInfo(String name, StoryInfoDto storyInfoDto) {
		StoryInfo storyInfo = new StoryInfo();
		storyInfo.setId(storyInfoDto.getId());
		storyInfo.setName(storyInfoDto.getName());
		storyInfo.setAge(storyInfoDto.getAge());
		log.debug("storyInfo created, id:"+ storyInfoDto.getId());
		storyInfoDomainService.updateStoryInfo(storyInfo);
		return storyInfoDto;
	}
	public void deleteUserInfo(String name) {
		storyInfoDomainService.deleteUserInfo(name);
	}
	
}
