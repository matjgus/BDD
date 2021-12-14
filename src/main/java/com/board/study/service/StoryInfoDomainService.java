package com.board.study.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

import com.board.study.entity.board.StoryInfo;
import com.board.study.entity.board.StoryInfoRepository;


@Service
@RequiredArgsConstructor
@Slf4j
public class StoryInfoDomainService {
	private final StoryInfoRepository storyInfoRepository;
	
	@Transactional
	public StoryInfo getStoryInfo(String name) {
		Optional<StoryInfo> storyInfo = storyInfoRepository.findByName(name);
		if(!storyInfo.isPresent())
			throw new RuntimeException("findByName, not found:"+name);
		return storyInfo.get();
	}
	
	@Transactional
	public StoryInfo createStoryInfo(StoryInfo storyInfo) {
		storyInfo = storyInfoRepository.save(storyInfo);
		return storyInfo;
	}
	
	@Transactional
	public void updateStoryInfo(StoryInfo storyInfo) {
		log.debug("storyInfo.getId() : " + storyInfo.getId());
		StoryInfo storyinfo1 = storyInfoRepository.findById(storyInfo.getId())
				.orElseThrow(()->new RuntimeException("not found"));
		log.debug("storyinfo1.getId():" + storyinfo1.getId());
		log.debug("storyinfo1.getName():" + storyinfo1.getName());
		log.debug("storyinfo1.getAge():" + storyinfo1.getAge());
		storyinfo1.setId(storyInfo.getId());
		storyinfo1.setName(storyInfo.getName());
		storyinfo1.setAge(storyInfo.getAge());
		storyInfoRepository.save(storyinfo1);
	}
	@Transactional
	public void deleteUserInfo(String name) {
		storyInfoRepository.deleteByName(name);
	}
}
