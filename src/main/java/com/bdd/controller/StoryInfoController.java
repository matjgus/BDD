package com.bdd.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.domain.entity.board.StoryInfo;
import com.bdd.dto.board.StoryInfoRequestDto;
import com.bdd.dto.board.StoryInfoResponseDto;
import com.bdd.service.StoryInfoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class StoryInfoController {
	
	private final StoryInfoService storyInfoService;
	
	@GetMapping("/storylist")
	public List<StoryInfoResponseDto> getStoryInfoList(){
		return storyInfoService.findAll();
	}
	@PostMapping("/story")
	public Long reqStoryInfo(@RequestBody StoryInfoRequestDto requestDto) {
		return storyInfoService.save(requestDto);
	}
	@PostMapping("/storylist")
	public List<Long> reqStoryInfoList(@RequestBody List<StoryInfoRequestDto> requestDtos){
		StoryInfoRequestDto requestDto;
		List<Long> storyList = new ArrayList<Long>();
		
		for(int i=0;i<requestDtos.size();i++) {
			requestDto = requestDtos.get(i);
			storyList.add(storyInfoService.save(requestDto));
		}
		return storyList;
	}
	@GetMapping("/storydetail")
    public Optional<StoryInfo> findStoryById( @RequestParam(value = "idx")String idx) throws Exception{
        System.out.println("======================!!!!!=========");
        System.out.println("======================!!!!!=========");
        System.out.println("======================!!!!!=========");

        System.out.println(idx);
        long storyidx = Long.parseLong(idx);
        System.out.println("======================!!!!!=========");
        System.out.println("======================!!!!!=========");
        System.out.println("======================!!!!!=========");
        return storyInfoService.selectStoryDetail(storyidx);
        // return null;
    }
	
	@DeleteMapping("/story")
	public Long deleteStoryInfoById(Long storyList) {
		return storyInfoService.deleteById(storyList);
	}
}

