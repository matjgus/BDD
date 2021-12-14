package com.board.study.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.board.study.dto.board.StoryInfoDto;
import com.board.study.service.StoryInfoService;

@RestController
public class StoryInfoController {
	final StoryInfoService storyInfoService;
	
	public StoryInfoController(StoryInfoService storyInfoService) {
		this.storyInfoService = storyInfoService;
	}
	@PostMapping("/storyinfo")
	public StoryInfoDto createStoryInfo(@RequestBody StoryInfoDto storyInfoDto) {
		return storyInfoService.createStoryInfo(storyInfoDto);
	}
	@GetMapping("/storyinfo/{name}")
	public StoryInfoDto selectStoyInfo(@PathVariable String name) {
		return storyInfoService.selectStoryInfo(name);
	}
	@PutMapping("/storyinfo/{name}")
	public StoryInfoDto updateStoryInfo(@PathVariable String name, @RequestBody StoryInfoDto storyInfoDto) {
		return storyInfoService.updateStoryInfo(name, storyInfoDto);
	}
	@DeleteMapping("/storyinfo/{name}")
	public String deleteStoryInfo(@PathVariable String name) {
		storyInfoService.deleteUserInfo(name);
		return "deleted"+name;
	}

}

